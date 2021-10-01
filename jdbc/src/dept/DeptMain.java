package dept;

import java.util.List;
import java.util.Scanner;

public class DeptMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		DeptDAO dao = new DeptDAO();
		while (run) {
			System.out.println("***********************");
			System.out.println("1. 전체 부서 조회");
			System.out.println("2. 특정 부서 조회");
			System.out.println("3. 부서 추가");
			System.out.println("4. 부서 수정");
			System.out.println("5. 부서 삭제");
			System.out.println("6. 종료");
			System.out.println("***********************");

			System.out.print("선택 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				List<DeptDTO> list = dao.getRows();
				System.out.println("부서번호\t부서명\t지역");
				for (DeptDTO dto : list) {
					System.out.print(dto.getDeptNo() + "\t");
					System.out.print(dto.getDname() + "\t");
					System.out.println(dto.getLoc() + "\t");

				}
				System.out.println();

				break;
			case 2:
				System.out.println("\n 조회 부서 번호 입력 >>");
				int deptNo = sc.nextInt();
				DeptDTO dto1 = dao.select(deptNo);

				System.out.println("부서번호 : " + dto1.getDeptNo() + "\t");
				System.out.println("부서명 : " + dto1.getDname() + "\t");
				System.out.println("위치 : " + dto1.getLoc() + "\t");
				System.out.println();
				break;
			case 3:
				System.out.println("부서 추가");
				System.out.print("부서번호 : ");
				int newdeptNo = sc.nextInt();
				System.out.print("부서명 : ");
				String newDname = sc.next();
				System.out.print("위치 : ");
				String newLoc = sc.next();
				
				DeptDTO dto = new DeptDTO(newdeptNo,newDname,newLoc);
				System.out.println(dao.insert(newdeptNo, newDname, newDname));
				System.out.println();
				break;
			case 4:
				System.out.println("\n부서 수정");
				System.out.print("수정 부서 번호 : ");
				int updateDeptNo = sc.nextInt();
				System.out.print("수정 부서명 : ");
				String updateDname = sc.next();
				
				System.out.println(dao.updateSet(updateDname, updateDeptNo));
				System.out.println();
				break;
			case 5:
				System.out.println("\n부서 삭제");
				System.out.print("삭제할 부서 번호");
				int deldeptNo = sc.nextInt();
				System.out.println(dao.deletex(deldeptNo));
				System.out.println();
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("번호를 확인해 주세요");
				break;
			}

		}

	}

}

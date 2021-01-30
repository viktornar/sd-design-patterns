package sd.design.patterns.simplified.examples.composite.tree;


import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        Node node = new Node();

        Part leaf1 = new Leaf();
        node.addChild(leaf1);

        Part leaf2 = new Leaf();
        node.addChild(leaf2);

        Part leaf3 = new Leaf();
        node.addChild(leaf3);

        node.addChild(new Node() {{
            addChild(new Leaf());
        }});

        node.printChilds();
//     Try this at home with departments
//        interface Department {
//            void printDepartmenInformation();
//        }
//
//        class HeadDepartment implements Department {
//            List<Department> deparments = new ArrayList<>();
//
//            @Override
//            void printDepartmenInformation() {
//                System.out.println("sdss");
//                deparments.forEach(Department::printDepartmenInformation);
//            }
//
//            void addChildDepartment(Departmen d) {
//                deparments.add(d);
//            }
//        }
//
//        class FinanceDepartment implements Department {
//            @Override
//            void printDepartmenInformation() {
//                System.out.println("sdss");
//            }
//        }
//
//        class StatisticDepartment implements Department {
//            @Override
//            void printDepartmenInformation() {
//                System.out.println("Stat");
//            }
//        }
//
//        HeadDepartment head = new HeadDepartment();
//        head.addChildDepartment(new FinanceDepartment()) ;
//        head.addChildDepartment(new StatisticDepartment());
//
//        head.printDepartmenInformation();
    }
}

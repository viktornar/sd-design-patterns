package sd.design.patterns.simplified.examples.visitor;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());

        d.getElements().add(new JsonElement(generateUuid()));
        d.getElements().add(new JsonElement(generateUuid()));
        d.getElements().add(new XmlElement(generateUuid()));

        d.process(v);
    }

    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }
}

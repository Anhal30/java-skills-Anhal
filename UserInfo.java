public class UserInfo {

    // المتغيرات الخاصة بالمستخدم (مخفية باستخدام private)
    private String name;
    private int age;
    private String email;
    private boolean isActive;

    // المُنشئ (constructor) - يُستخدم لإنشاء كائن جديد
    public UserInfo(String name, int age, String email, boolean isActive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return isActive;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // عرض المعلومات
    public void displayInfo() {
        System.out.println("---- User Info ----");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Email    : " + email);
        System.out.println("Active   : " + (isActive ? "Yes" : "No"));
        System.out.println("-------------------\n");
    }

    // دالة main لاختبار الكلاس
    public static void main(String[] args) {
        // إنشاء 3 مستخدمين
        UserInfo user1 = new UserInfo("Anhal", 22, "anhal@example.com", true);
        UserInfo user2 = new UserInfo("Sara", 19, "sara@example.com", false);
        UserInfo user3 = new UserInfo("Yousef", 25, "yousef@example.com", true);

        // عرض معلوماتهم
        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();

        // تعديل إيميل أنهل وحالتها
        user1.setEmail("anhal.new@example.com");
        user1.setActive(false);

        // عرض بعد التعديل
        System.out.println("After updating Anhal's info:");
        user1.displayInfo();
    }
}

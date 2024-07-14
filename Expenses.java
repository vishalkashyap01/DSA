import java.util.Random;

public class Expenses {
    public static void main(String []buget) {

        getHousing();
    }
}

class Housing {
    static int rent = 4500;
    private int electricity, water, gas;
    int units;
    void getHousing() {
        units = (int) Math.floor(random() * 5);
        System.out.println(units);
    }

}
/*
Housing: (Rent/(Electricity, Water, Gas))

Transportation: (Public Transportation/Maintenance and Repairs)

Food: (Groceries/Dining Out/Takeout/(Coffee/Tea/Snacks)

Personal Care: (Haircuts/Styling/Toiletries/Gym Memberships)

Utilities: (Internet/Mobile)

Insurance: (Health Insurance/Life Insurance/Car Insurance)

Debt Payments:(Credit Card Payments/Personal Loans)

Entertainment: (Streaming Services (Netflix, Spotify, etc.)/Movies/Hobbies/Club Memberships

Clothing: (Clothes/Shoes/Accessories)

Medical/Healthcare: (Doctor Visits/Medications/Health Supplies)

Education: (Tuition Fees/Books/Supplies/Courses/Workshops)

Savings/Investments: (Savings/Investments)

Miscellaneous: (Gifts/Donations/Pet Expenses/Home Maintenance)

 */
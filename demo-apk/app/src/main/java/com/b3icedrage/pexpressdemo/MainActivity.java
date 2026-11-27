package com.b3icedrage.pexpressdemo;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private final int bg = Color.rgb(12, 17, 28);
    private final int panel = Color.rgb(23, 31, 46);
    private final int muted = Color.rgb(154, 166, 186);
    private final int green = Color.rgb(36, 205, 137);
    private final int red = Color.rgb(255, 100, 112);
    private final DecimalFormat money = new DecimalFormat("#,##0.00");
    private double balance;
    private double stake = 5.0;
    private String side = "BUY";
    private String expiry = "1 min";
    private LinearLayout root, tradesBox, stakeButtons;
    private TextView balanceText, stakeText, sideText, expiryText, emptyText;
    private final List<String> trades = new ArrayList<>();
    private int nextId = 1;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        balance = getPreferences(0).getFloat("paper_balance", 1000f);
        buildUi();
    }

    private GradientDrawable shape(int color, int radius) {
        GradientDrawable d = new GradientDrawable();
        d.setColor(color);
        d.setCornerRadius(radius);
        return d;
    }

    private TextView label(String value, int size, int color, boolean bold) {
        TextView t = new TextView(this);
        t.setText(value); t.setTextSize(size); t.setTextColor(color);
        if (bold) t.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        return t;
    }

    private LinearLayout column() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        return l;
    }

    private void addSpace(LinearLayout parent, int h) {
        View v = new View(this); parent.addView(v, new LinearLayout.LayoutParams(1, h));
    }

    private TextView section(String title) {
        TextView t = label(title, 17, Color.WHITE, true);
        t.setPadding(0, 22, 0, 10); return t;
    }

    private Button button(String text, int color, Runnable action) {
        Button b = new Button(this);
        b.setText(text); b.setTextColor(Color.WHITE); b.setAllCaps(false);
        b.setTextSize(14); b.setBackground(shape(color, 18));
        b.setOnClickListener(v -> action.run());
        return b;
    }

    private void buildUi() {
        ScrollView scroll = new ScrollView(this);
        scroll.setFillViewport(true); scroll.setBackgroundColor(bg);
        root = column(); root.setPadding(20, 30, 20, 28);
        scroll.addView(root); setContentView(scroll);

        LinearLayout header = new LinearLayout(this);
        header.setGravity(Gravity.CENTER_VERTICAL);
        TextView name = label("PExpress", 27, Color.WHITE, true);
        header.addView(name, new LinearLayout.LayoutParams(0, -2, 1));
        TextView badge = label("DEMO ONLY", 12, bg, true);
        badge.setPadding(12, 8, 12, 8); badge.setBackground(shape(green, 30));
        header.addView(badge); root.addView(header);
        addSpace(root, 5);
        root.addView(label("SIMULATOR  •  No broker connection  •  No real orders", 12, muted, false));

        LinearLayout balanceCard = column();
        balanceCard.setPadding(18, 18, 18, 18); balanceCard.setBackground(shape(panel, 22));
        LinearLayout.LayoutParams cp = new LinearLayout.LayoutParams(-1, -2);
        cp.topMargin = 22; root.addView(balanceCard, cp);
        balanceCard.addView(label("PAPER ACCOUNT BALANCE", 12, muted, true));
        balanceText = label("$" + money.format(balance), 34, Color.WHITE, true);
        balanceCard.addView(balanceText);
        balanceCard.addView(label("Virtual funds stored on this device", 12, muted, false));

        root.addView(section("Market watch"));
        String[][] markets = {{"EUR/USD","1.08420","Sample quote"},{"GBP/USD","1.27150","Sample quote"},{"USD/JPY","149.820","Sample quote"},{"XAU/USD","2,340.50","Sample quote"}};
        for (String[] m : markets) {
            LinearLayout row = new LinearLayout(this);
            row.setGravity(Gravity.CENTER_VERTICAL); row.setPadding(14, 13, 14, 13);
            row.setBackground(shape(panel, 15));
            LinearLayout.LayoutParams rp = new LinearLayout.LayoutParams(-1, -2); rp.bottomMargin = 8;
            root.addView(row, rp);
            TextView pair = label(m[0], 15, Color.WHITE, true);
            row.addView(pair, new LinearLayout.LayoutParams(0, -2, 1));
            LinearLayout price = column(); price.setGravity(Gravity.RIGHT);
            price.addView(label(m[1], 15, Color.WHITE, true));
            price.addView(label(m[2], 10, muted, false)); row.addView(price);
        }

        root.addView(section("Paper trade"));
        LinearLayout tradeCard = column(); tradeCard.setPadding(16, 16, 16, 16);
        tradeCard.setBackground(shape(panel, 20)); root.addView(tradeCard);
        tradeCard.addView(label("Instrument", 12, muted, true));
        tradeCard.addView(label("EUR/USD  •  Example market", 16, Color.WHITE, true));
        addSpace(tradeCard, 12);
        tradeCard.addView(label("Virtual stake", 12, muted, true));
        stakeText = label("$" + money.format(stake), 22, Color.WHITE, true); tradeCard.addView(stakeText);
        stakeButtons = new LinearLayout(this); stakeButtons.setGravity(Gravity.CENTER);
        tradeCard.addView(stakeButtons);
        for (double amount : new double[]{1,5,10,25}) {
            Button b = button("$" + (int)amount, Color.rgb(48,61,82), () -> { stake = amount; refreshControls(); });
            LinearLayout.LayoutParams bp = new LinearLayout.LayoutParams(0, 48, 1); bp.setMargins(3, 6, 3, 6); stakeButtons.addView(b, bp);
        }
        sideText = label("Direction: BUY", 15, Color.WHITE, true); sideText.setPadding(0, 12, 0, 5); tradeCard.addView(sideText);
        LinearLayout sides = new LinearLayout(this);
        sides.addView(button("BUY", green, () -> { side = "BUY"; refreshControls(); }), new LinearLayout.LayoutParams(0, 50, 1));
        sides.addView(button("SELL", red, () -> { side = "SELL"; refreshControls(); }), new LinearLayout.LayoutParams(0, 50, 1));
        tradeCard.addView(sides);
        expiryText = label("Expiry: 1 min", 14, muted, false); expiryText.setPadding(0, 12, 0, 8); tradeCard.addView(expiryText);
        LinearLayout expiries = new LinearLayout(this);
        for (String e : new String[]{"30 sec","1 min","5 min"}) {
            Button b = button(e, Color.rgb(48,61,82), () -> { expiry = e; refreshControls(); });
            LinearLayout.LayoutParams ep = new LinearLayout.LayoutParams(0, 46, 1); ep.setMargins(3,0,3,0); expiries.addView(b, ep);
        }
        tradeCard.addView(expiries);
        Button open = button("Open simulated " + side, Color.rgb(38, 112, 180), this::openTrade);
        LinearLayout.LayoutParams op = new LinearLayout.LayoutParams(-1, 54); op.topMargin = 15; tradeCard.addView(open, op);

        root.addView(section("Paper trade history"));
        tradesBox = column(); root.addView(tradesBox);
        emptyText = label("No simulated trades yet. Open a paper trade above.", 13, muted, false);
        tradesBox.addView(emptyText);
        Button reset = button("Reset virtual balance to $1,000", Color.rgb(48,61,82), () -> {
            balance = 1000; getPreferences(0).edit().putFloat("paper_balance", 1000f).apply();
            refreshBalance(); Toast.makeText(this, "Paper balance reset", Toast.LENGTH_SHORT).show();
        });
        LinearLayout.LayoutParams zp = new LinearLayout.LayoutParams(-1, 50); zp.topMargin = 24; root.addView(reset, zp);
        addSpace(root, 18);
        root.addView(label("Educational simulator only. Prices are examples, outcomes are manually selected, and nothing connects to Pocket Option or any broker.", 11, muted, false));
    }

    private void refreshControls() {
        stakeText.setText("$" + money.format(stake));
        sideText.setText("Direction: " + side);
        expiryText.setText("Expiry: " + expiry);
    }

    private void refreshBalance() { balanceText.setText("$" + money.format(balance)); }

    private void openTrade() {
        if (stake > balance) { Toast.makeText(this, "Insufficient virtual balance", Toast.LENGTH_SHORT).show(); return; }
        String id = "P" + (nextId++);
        balance -= stake;
        getPreferences(0).edit().putFloat("paper_balance", (float)balance).apply();
        refreshBalance();
        if (emptyText != null && tradesBox.indexOfChild(emptyText) >= 0) tradesBox.removeView(emptyText);
        LinearLayout card = column(); card.setPadding(14,14,14,14); card.setBackground(shape(panel,16));
        LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(-1,-2); p.bottomMargin = 9; tradesBox.addView(card,0,p);
        card.addView(label(id + "  •  EUR/USD  •  " + side, 15, Color.WHITE, true));
        card.addView(label("Stake $" + money.format(stake) + "  •  " + expiry + "  •  OPEN", 12, muted, false));
        LinearLayout actions = new LinearLayout(this); actions.setPadding(0,10,0,0);
        Button win = button("Settle WIN (+80%)", green, () -> settle(card, id, stake, true));
        Button loss = button("Settle LOSS", red, () -> settle(card, id, stake, false));
        actions.addView(win, new LinearLayout.LayoutParams(0,48,1));
        actions.addView(loss, new LinearLayout.LayoutParams(0,48,1));
        card.addView(actions);
        Toast.makeText(this, "Paper trade opened. Choose a manual outcome to settle.", Toast.LENGTH_LONG).show();
    }

    private void settle(LinearLayout card, String id, double amount, boolean won) {
        balance += won ? amount * 1.8 : 0;
        getPreferences(0).edit().putFloat("paper_balance", (float)balance).apply();
        refreshBalance();
        card.removeAllViews();
        card.addView(label(id + "  •  " + (won ? "MANUAL WIN" : "MANUAL LOSS"), 15, won ? green : red, true));
        card.addView(label("Virtual stake $" + money.format(amount) + "  •  " + (won ? "Returned with illustrative 80% payout" : "Stake lost"), 12, muted, false));
    }
}

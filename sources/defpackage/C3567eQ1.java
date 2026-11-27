package defpackage;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: eQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3567eQ1 {
    public static final PrintStream a = System.out;
    public static final C0711Bx b = new C0711Bx("HH:mm:ss,SSS");

    public static void a(StringBuilder sb, String str, XP1 xp1) {
        String strC = xp1.d() ? Z0.c(str, "+ ") : Z0.c(str, "|-");
        C0711Bx c0711Bx = b;
        if (c0711Bx != null) {
            sb.append(c0711Bx.a(xp1.c().longValue()));
            sb.append(" ");
        }
        sb.append(strC);
        sb.append(xp1);
        sb.append(C3766fN.a);
        if (xp1.a() != null) {
            Throwable thA = xp1.a();
            LinkedList linkedList = new LinkedList();
            U0.i(linkedList, thA, null);
            for (String str2 : (String[]) linkedList.toArray(new String[0])) {
                if (!str2.startsWith("Caused by: ")) {
                    if (Character.isDigit(str2.charAt(0))) {
                        sb.append("\t... ");
                    } else {
                        sb.append("\tat ");
                    }
                }
                sb.append(str2);
                sb.append(C3766fN.a);
            }
        }
        if (xp1.d()) {
            Iterator<XP1> it = xp1.iterator();
            while (it.hasNext()) {
                a(sb, str + "  ", it.next());
            }
        }
    }

    public static void b(HS0 hs0) {
        if (hs0 == null) {
            throw new IllegalArgumentException("Context argument cannot be null");
        }
        C4538ir c4538ir = hs0.g;
        PrintStream printStream = a;
        if (c4538ir == null) {
            printStream.println("WARN: Context named \"" + hs0.e + "\" has no status manager");
            return;
        }
        int level = 0;
        for (XP1 xp1 : C0564Aa.k(c4538ir.c(), 0L)) {
            if (xp1.getLevel() > level) {
                level = xp1.getLevel();
            }
        }
        if (level >= 1) {
            StringBuilder sb = new StringBuilder();
            Iterator it = C0564Aa.k(c4538ir.c(), 0L).iterator();
            while (it.hasNext()) {
                a(sb, "", (XP1) it.next());
            }
            printStream.println(sb.toString());
        }
    }
}

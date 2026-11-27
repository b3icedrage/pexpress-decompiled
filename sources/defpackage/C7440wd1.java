package defpackage;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: renamed from: wd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7440wd1 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: wd1$a */
    public static class a {
        public static C7440wd1 a(Person person) {
            IconCompat iconCompat;
            CharSequence name = person.getName();
            IconCompat iconCompatB = null;
            if (person.getIcon() != null) {
                Icon icon = person.getIcon();
                PorterDuff.Mode mode = IconCompat.k;
                icon.getClass();
                int iC = IconCompat.a.c(icon);
                if (iC != 2) {
                    if (iC == 4) {
                        Uri uriD = IconCompat.a.d(icon);
                        uriD.getClass();
                        String string = uriD.toString();
                        string.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.b = string;
                    } else if (iC != 6) {
                        iconCompatB = new IconCompat(-1);
                        iconCompatB.b = icon;
                    } else {
                        Uri uriD2 = IconCompat.a.d(icon);
                        uriD2.getClass();
                        String string2 = uriD2.toString();
                        string2.getClass();
                        iconCompat = new IconCompat(6);
                        iconCompat.b = string2;
                    }
                    iconCompatB = iconCompat;
                } else {
                    iconCompatB = IconCompat.b(null, IconCompat.a.b(icon), IconCompat.a.a(icon));
                }
            }
            String uri = person.getUri();
            String key = person.getKey();
            boolean zIsBot = person.isBot();
            boolean zIsImportant = person.isImportant();
            C7440wd1 c7440wd1 = new C7440wd1();
            c7440wd1.a = name;
            c7440wd1.b = iconCompatB;
            c7440wd1.c = uri;
            c7440wd1.d = key;
            c7440wd1.e = zIsBot;
            c7440wd1.f = zIsImportant;
            return c7440wd1;
        }

        public static Person b(C7440wd1 c7440wd1) {
            Person.Builder name = new Person.Builder().setName(c7440wd1.a);
            Icon iconF = null;
            IconCompat iconCompat = c7440wd1.b;
            if (iconCompat != null) {
                iconCompat.getClass();
                iconF = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(iconF).setUri(c7440wd1.c).setKey(c7440wd1.d).setBot(c7440wd1.e).setImportant(c7440wd1.f).build();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7440wd1)) {
            return false;
        }
        C7440wd1 c7440wd1 = (C7440wd1) obj;
        String str = this.d;
        String str2 = c7440wd1.d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.a), Objects.toString(c7440wd1.a)) && Objects.equals(this.c, c7440wd1.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(c7440wd1.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(c7440wd1.f));
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}

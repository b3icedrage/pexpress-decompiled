package defpackage;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4027gd implements InterfaceC3122cI {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: gd$a */
    public static class a {
        public static final HashSet a = new HashSet(Arrays.asList(Zh2.a.a.b()));
    }

    /* JADX INFO: renamed from: gd$b */
    public static class b extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: gd$c */
    public static class c extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: renamed from: gd$d */
    public static class d extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return false;
        }
    }

    /* JADX INFO: renamed from: gd$e */
    public static class e extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: renamed from: gd$f */
    public static class f extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: renamed from: gd$g */
    public static class g extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: renamed from: gd$h */
    public static class h extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: renamed from: gd$i */
    public static class i extends AbstractC4027gd {
        @Override // defpackage.AbstractC4027gd
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public AbstractC4027gd(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    @Override // defpackage.InterfaceC3122cI
    public final boolean a() {
        return c() || d();
    }

    @Override // defpackage.InterfaceC3122cI
    public final String b() {
        return this.a;
    }

    public abstract boolean c();

    public boolean d() {
        HashSet hashSet = a.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}

package defpackage;

/* JADX INFO: renamed from: a20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2634a20 {
    public static final a a = new a();
    public static final b b = new b();
    public static final c c = new c();
    public static final e d;

    /* JADX INFO: renamed from: a20$a */
    public class a extends AbstractC2634a20 {
        @Override // defpackage.AbstractC2634a20
        public final boolean a() {
            return true;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean b() {
            return true;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean c(CS cs) {
            return cs == CS.e;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean d(boolean z, CS cs, A60 a60) {
            return (cs == CS.h || cs == CS.i) ? false : true;
        }
    }

    /* JADX INFO: renamed from: a20$b */
    public class b extends AbstractC2634a20 {
        @Override // defpackage.AbstractC2634a20
        public final boolean a() {
            return false;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean b() {
            return false;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean c(CS cs) {
            return false;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean d(boolean z, CS cs, A60 a60) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a20$c */
    public class c extends AbstractC2634a20 {
        @Override // defpackage.AbstractC2634a20
        public final boolean a() {
            return true;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean b() {
            return false;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean c(CS cs) {
            return (cs == CS.g || cs == CS.i) ? false : true;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean d(boolean z, CS cs, A60 a60) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a20$d */
    public class d extends AbstractC2634a20 {
        @Override // defpackage.AbstractC2634a20
        public final boolean a() {
            return false;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean b() {
            return true;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean c(CS cs) {
            return false;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean d(boolean z, CS cs, A60 a60) {
            return (cs == CS.h || cs == CS.i) ? false : true;
        }
    }

    /* JADX INFO: renamed from: a20$e */
    public class e extends AbstractC2634a20 {
        @Override // defpackage.AbstractC2634a20
        public final boolean a() {
            return true;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean b() {
            return true;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean c(CS cs) {
            return cs == CS.e;
        }

        @Override // defpackage.AbstractC2634a20
        public final boolean d(boolean z, CS cs, A60 a60) {
            return ((z && cs == CS.g) || cs == CS.d) && a60 == A60.e;
        }
    }

    static {
        new d();
        d = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(CS cs);

    public abstract boolean d(boolean z, CS cs, A60 a60);
}

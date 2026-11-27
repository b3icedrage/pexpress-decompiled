package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class WX1 {
    public static final c a = new c(null, false);
    public static final c b = new c(null, true);
    public static final c c;
    public static final c d;

    public static class a {
        public static final a a = new a();
    }

    public static abstract class b {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public abstract boolean a();

        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        public final boolean b(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            if (this.a == null) {
                return a();
            }
            char c = 0;
            c = 2;
            for (int i2 = 0; i2 < i && c == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                c cVar = WX1.a;
                if (directionality == 0) {
                    c = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            c = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            c = 2;
                            continue;
                    }
                }
            }
            if (c == 0) {
                return true;
            }
            if (c != 1) {
                return a();
            }
            return false;
        }
    }

    public static class c extends b {
        public final boolean b;

        public c(a aVar, boolean z) {
            super(aVar);
            this.b = z;
        }

        @Override // WX1.b
        public final boolean a() {
            return this.b;
        }
    }

    static {
        a aVar = a.a;
        c = new c(aVar, false);
        d = new c(aVar, true);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class GM {
    public static final GM c = new GM();
    public FM a;
    public Object b;

    public final void a(HS0 hs0, Object obj) throws IllegalAccessException, ClassNotFoundException {
        String property;
        Class<?> cls;
        Object obj2 = this.b;
        if (obj2 == null) {
            this.b = obj;
        } else if (obj2 != obj) {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        try {
            property = System.getProperty("logback.ContextSelector");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            C2952bV c2952bV = new C2952bV();
            c2952bV.a = hs0;
            this.a = c2952bV;
        } else {
            if (property.equals("JNDI")) {
                this.a = new C7594xM(hs0);
                return;
            }
            if (C6559sR0.a) {
                cls = Class.forName(property);
            } else {
                try {
                    cls = Thread.currentThread().getContextClassLoader().loadClass(property);
                } catch (Throwable unused2) {
                    cls = Class.forName(property);
                }
            }
            this.a = (FM) cls.getConstructor(HS0.class).newInstance(hs0);
        }
    }
}

package defpackage;

/* JADX INFO: renamed from: xk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7677xk0 implements CZ0 {
    public static final C7677xk0 a = new C7677xk0();

    @Override // defpackage.CZ0
    public final AZ0 a(Class<?> cls) {
        if (!AbstractC0595Ak0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (AZ0) AbstractC0595Ak0.r(cls.asSubclass(AbstractC0595Ak0.class)).q(AbstractC0595Ak0.e.g);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.CZ0
    public final boolean b(Class<?> cls) {
        return AbstractC0595Ak0.class.isAssignableFrom(cls);
    }
}

package defpackage;

/* JADX INFO: renamed from: yk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7887yk0 implements DZ0 {
    public static final C7887yk0 a = new C7887yk0();

    @Override // defpackage.DZ0
    public final BZ0 a(Class<?> cls) {
        if (!AbstractC8097zk0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (BZ0) AbstractC8097zk0.j(cls.asSubclass(AbstractC8097zk0.class)).i(AbstractC8097zk0.f.g);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.DZ0
    public final boolean b(Class<?> cls) {
        return AbstractC8097zk0.class.isAssignableFrom(cls);
    }
}

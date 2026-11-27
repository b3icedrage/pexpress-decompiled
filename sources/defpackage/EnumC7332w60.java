package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7332w60 implements InterfaceC1145Hl1<Object> {
    public static final EnumC7332w60 d;
    public static final /* synthetic */ EnumC7332w60[] e;

    static {
        EnumC7332w60 enumC7332w60 = new EnumC7332w60("INSTANCE", 0);
        d = enumC7332w60;
        e = new EnumC7332w60[]{enumC7332w60};
    }

    public EnumC7332w60() {
        throw null;
    }

    public static EnumC7332w60 valueOf(String str) {
        return (EnumC7332w60) Enum.valueOf(EnumC7332w60.class, str);
    }

    public static EnumC7332w60[] values() {
        return (EnumC7332w60[]) e.clone();
    }

    @Override // defpackage.InterfaceC1067Gl1
    public final int e() {
        return 2;
    }

    @Override // defpackage.InterfaceC4863kM1
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.InterfaceC4863kM1
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.InterfaceC4863kM1
    public final Object poll() {
        return null;
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void s(long j) {
        EnumC7620xU1.e(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void cancel() {
    }

    @Override // defpackage.InterfaceC4863kM1
    public final void clear() {
    }
}

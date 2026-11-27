package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: k60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4810k60 implements InterfaceC1067Gl1, InterfaceC7316w20 {
    public static final EnumC4810k60 d;
    public static final /* synthetic */ EnumC4810k60[] e;

    static {
        EnumC4810k60 enumC4810k60 = new EnumC4810k60("INSTANCE", 0);
        d = enumC4810k60;
        e = new EnumC4810k60[]{enumC4810k60, new EnumC4810k60("NEVER", 1)};
    }

    public EnumC4810k60() {
        throw null;
    }

    public static EnumC4810k60 valueOf(String str) {
        return (EnumC4810k60) Enum.valueOf(EnumC4810k60.class, str);
    }

    public static EnumC4810k60[] values() {
        return (EnumC4810k60[]) e.clone();
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

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
    }

    @Override // defpackage.InterfaceC4863kM1
    public final void clear() {
    }
}

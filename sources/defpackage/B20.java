package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class B20 implements InterfaceC7316w20 {
    public static final B20 d;
    public static final /* synthetic */ B20[] e;

    static {
        B20 b20 = new B20("DISPOSED", 0);
        d = b20;
        e = new B20[]{b20};
    }

    public B20() {
        throw null;
    }

    public static void e(AtomicReference atomicReference) {
        InterfaceC7316w20 interfaceC7316w20;
        InterfaceC7316w20 interfaceC7316w21 = (InterfaceC7316w20) atomicReference.get();
        B20 b20 = d;
        if (interfaceC7316w21 == b20 || (interfaceC7316w20 = (InterfaceC7316w20) atomicReference.getAndSet(b20)) == b20 || interfaceC7316w20 == null) {
            return;
        }
        interfaceC7316w20.b();
    }

    public static B20 valueOf(String str) {
        return (B20) Enum.valueOf(B20.class, str);
    }

    public static B20[] values() {
        return (B20[]) e.clone();
    }

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
    }
}

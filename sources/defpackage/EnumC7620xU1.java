package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7620xU1 implements InterfaceC6779tU1 {
    public static final EnumC7620xU1 d;
    public static final /* synthetic */ EnumC7620xU1[] e;

    static {
        EnumC7620xU1 enumC7620xU1 = new EnumC7620xU1("CANCELLED", 0);
        d = enumC7620xU1;
        e = new EnumC7620xU1[]{enumC7620xU1};
    }

    public EnumC7620xU1() {
        throw null;
    }

    public static void b(AtomicReference atomicReference) {
        InterfaceC6779tU1 interfaceC6779tU1;
        InterfaceC6779tU1 interfaceC6779tU2 = (InterfaceC6779tU1) atomicReference.get();
        EnumC7620xU1 enumC7620xU1 = d;
        if (interfaceC6779tU2 == enumC7620xU1 || (interfaceC6779tU1 = (InterfaceC6779tU1) atomicReference.getAndSet(enumC7620xU1)) == enumC7620xU1 || interfaceC6779tU1 == null) {
            return;
        }
        interfaceC6779tU1.cancel();
    }

    public static boolean e(long j) {
        if (j > 0) {
            return true;
        }
        EB1.b(new IllegalArgumentException(C6419rl.a("n > 0 required but it was ", j)));
        return false;
    }

    public static boolean f(InterfaceC6779tU1 interfaceC6779tU1, InterfaceC6779tU1 interfaceC6779tU2) {
        if (interfaceC6779tU2 == null) {
            EB1.b(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC6779tU1 == null) {
            return true;
        }
        interfaceC6779tU2.cancel();
        EB1.b(new C1376Kk1("Subscription already set!"));
        return false;
    }

    public static EnumC7620xU1 valueOf(String str) {
        return (EnumC7620xU1) Enum.valueOf(EnumC7620xU1.class, str);
    }

    public static EnumC7620xU1[] values() {
        return (EnumC7620xU1[]) e.clone();
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void cancel() {
    }

    @Override // defpackage.InterfaceC6779tU1
    public final void s(long j) {
    }
}

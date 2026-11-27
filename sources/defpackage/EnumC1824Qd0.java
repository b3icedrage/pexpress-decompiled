package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Qd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1824Qd0 implements Executor {
    public static final EnumC1824Qd0 d;
    public static final /* synthetic */ EnumC1824Qd0[] e;

    static {
        EnumC1824Qd0 enumC1824Qd0 = new EnumC1824Qd0("INSTANCE", 0);
        d = enumC1824Qd0;
        e = new EnumC1824Qd0[]{enumC1824Qd0};
    }

    public EnumC1824Qd0() {
        throw null;
    }

    public static EnumC1824Qd0 valueOf(String str) {
        return (EnumC1824Qd0) Enum.valueOf(EnumC1824Qd0.class, str);
    }

    public static EnumC1824Qd0[] values() {
        return (EnumC1824Qd0[]) e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

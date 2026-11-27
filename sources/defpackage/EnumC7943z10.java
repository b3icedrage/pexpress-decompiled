package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC7943z10 implements Executor {
    public static final EnumC7943z10 d;
    public static final /* synthetic */ EnumC7943z10[] e;

    static {
        EnumC7943z10 enumC7943z10 = new EnumC7943z10("INSTANCE", 0);
        d = enumC7943z10;
        e = new EnumC7943z10[]{enumC7943z10};
    }

    public EnumC7943z10() {
        throw null;
    }

    public static EnumC7943z10 valueOf(String str) {
        return (EnumC7943z10) Enum.valueOf(EnumC7943z10.class, str);
    }

    public static EnumC7943z10[] values() {
        return (EnumC7943z10[]) e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

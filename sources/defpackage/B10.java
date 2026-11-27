package defpackage;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B10 implements Executor {
    public static final B10 d;
    public static final /* synthetic */ B10[] e;

    static {
        B10 b10 = new B10("INSTANCE", 0);
        d = b10;
        e = new B10[]{b10};
    }

    public B10() {
        throw null;
    }

    public static B10 valueOf(String str) {
        return (B10) Enum.valueOf(B10.class, str);
    }

    public static B10[] values() {
        return (B10[]) e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return "DirectExecutor";
    }
}

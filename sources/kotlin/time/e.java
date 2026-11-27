package kotlin.time;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    @NotNull
    public static final e a = new e();
    public static final long b = System.nanoTime();

    @Override // kotlin.time.f
    public final TimeMark a() {
        return new f.a.C0434a(System.nanoTime() - b);
    }

    @NotNull
    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}

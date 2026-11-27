package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2833av extends UN1, ReadableByteChannel {
    @NotNull
    String C0(@NotNull Charset charset);

    int J(@NotNull C4437ia1 c4437ia1);

    boolean U(long j, @NotNull C1802Pw c1802Pw);

    long m0(@NotNull C1802Pw c1802Pw);

    long m1(@NotNull C1802Pw c1802Pw);

    @NotNull
    C1481Lu n();

    @NotNull
    C3024bo1 peek();

    void r(long j);

    @NotNull
    InputStream r1();

    boolean s(long j);

    long z0(@NotNull KM1 km1);
}

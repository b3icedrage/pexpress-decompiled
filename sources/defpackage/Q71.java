package defpackage;

import io.sentry.ILogger;
import io.sentry.vendor.gson.stream.b;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface Q71 extends Closeable {
    String B();

    void B0();

    @Nullable
    Date D0(ILogger iLogger);

    int E0();

    @Nullable
    <T> T H(@NotNull ILogger iLogger, @NotNull KG0<T> kg0);

    @Nullable
    Boolean H0();

    void I();

    @Nullable
    Integer K();

    @Nullable
    Float O0();

    void Q(ILogger iLogger, AbstractMap abstractMap, String str);

    @Nullable
    Long R();

    @Nullable
    Object W0();

    void X0();

    @Nullable
    TimeZone a0(ILogger iLogger);

    long a1();

    float c0();

    double d0();

    @Nullable
    HashMap d1(@NotNull ILogger iLogger, @NotNull KG0 kg0);

    @Nullable
    String e0();

    void g0(boolean z);

    void h1();

    boolean hasNext();

    void l1();

    @NotNull
    b peek();

    @Nullable
    ArrayList q0(@NotNull ILogger iLogger, @NotNull KG0 kg0);

    @Nullable
    Double u0();

    @NotNull
    String x0();
}

package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ed0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3608ed0<T> {

    @NotNull
    public static final LinkedHashSet d = new LinkedHashSet();

    @NotNull
    public static final Object e = new Object();

    @NotNull
    public final C0974Fg1 a;

    @NotNull
    public final Function1<File, SB0> b;

    @NotNull
    public final B3 c;

    public C3608ed0(B3 produceFile) {
        C0974Fg1 serializer = C0974Fg1.a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        C3189cd0 coordinatorProducer = C3189cd0.e;
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.a = serializer;
        this.b = coordinatorProducer;
        this.c = produceFile;
    }
}

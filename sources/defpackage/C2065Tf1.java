package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2065Tf1 {

    @NotNull
    public final InterfaceC5257mD a;

    @NotNull
    public final List<N62> b;

    @Nullable
    public final C2065Tf1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2065Tf1(@NotNull InterfaceC5257mD classifierDescriptor, @NotNull List<? extends N62> arguments, @Nullable C2065Tf1 c2065Tf1) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.a = classifierDescriptor;
        this.b = arguments;
        this.c = c2065Tf1;
    }
}

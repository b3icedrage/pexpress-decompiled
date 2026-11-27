package io.sentry.instrumentation.file;

import defpackage.C2688aH1;
import defpackage.InterfaceC2347Wu0;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @Nullable
    public final File a;

    @Nullable
    public final InterfaceC2347Wu0 b;

    @NotNull
    public final FileOutputStream c;

    @NotNull
    public final C2688aH1 d;

    public c(@Nullable File file, @Nullable InterfaceC2347Wu0 interfaceC2347Wu0, @NotNull FileOutputStream fileOutputStream, @NotNull C2688aH1 c2688aH1) {
        this.a = file;
        this.b = interfaceC2347Wu0;
        this.c = fileOutputStream;
        this.d = c2688aH1;
    }
}

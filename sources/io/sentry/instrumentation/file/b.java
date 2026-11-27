package io.sentry.instrumentation.file;

import defpackage.C2688aH1;
import defpackage.InterfaceC2347Wu0;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @Nullable
    public final File a;

    @Nullable
    public final InterfaceC2347Wu0 b;

    @NotNull
    public final FileInputStream c;

    @NotNull
    public final C2688aH1 d;

    public b(@Nullable File file, @Nullable InterfaceC2347Wu0 interfaceC2347Wu0, @NotNull FileInputStream fileInputStream, @NotNull C2688aH1 c2688aH1) {
        this.a = file;
        this.b = interfaceC2347Wu0;
        this.c = fileInputStream;
        this.d = c2688aH1;
    }
}

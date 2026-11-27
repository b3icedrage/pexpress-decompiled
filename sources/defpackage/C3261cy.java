package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3261cy {

    @NotNull
    public final Uri a;
    public final boolean b;

    @NotNull
    public final File c;

    public C3261cy(@NotNull Uri uri, boolean z, @NotNull File file) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(file, "file");
        this.a = uri;
        this.b = z;
        this.c = file;
    }
}

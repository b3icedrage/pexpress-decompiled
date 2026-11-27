package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1563Mv0 {

    @NotNull
    public final String a;

    @NotNull
    public final C2432Xo b;

    @NotNull
    public final File c;

    @NotNull
    public final String d;

    @Nullable
    public final DS0 e;

    public C1563Mv0(String instanceName, C2432Xo identityStorageProvider, File storageDirectory, String fileName, DS0 ds0) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        Intrinsics.checkNotNullParameter(storageDirectory, "storageDirectory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.a = instanceName;
        this.b = identityStorageProvider;
        this.c = storageDirectory;
        this.d = fileName;
        this.e = ds0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1563Mv0)) {
            return false;
        }
        C1563Mv0 c1563Mv0 = (C1563Mv0) obj;
        return Intrinsics.a(this.a, c1563Mv0.a) && Intrinsics.a(this.b, c1563Mv0.b) && Intrinsics.a(this.c, c1563Mv0.c) && Intrinsics.a(this.d, c1563Mv0.d) && Intrinsics.a(this.e, c1563Mv0.e);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b((this.c.hashCode() + ((this.b.hashCode() + (((this.a.hashCode() * 31) - 1893443286) * 961)) * 31)) * 31, 31, this.d);
        DS0 ds0 = this.e;
        return iB + (ds0 == null ? 0 : ds0.hashCode());
    }

    @NotNull
    public final String toString() {
        return "IdentityConfiguration(instanceName=" + this.a + ", apiKey=f85374691559c6d41e766cab7118bc7c, experimentApiKey=null, identityStorageProvider=" + this.b + ", storageDirectory=" + this.c + ", fileName=" + this.d + ", logger=" + this.e + ')';
    }
}

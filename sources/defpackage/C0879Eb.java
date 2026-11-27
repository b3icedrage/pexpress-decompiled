package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0879Eb {

    @NotNull
    public final C4693ja a;

    @NotNull
    public final C1502Mb b;

    @NotNull
    public final C1821Qc0 c;

    @NotNull
    public final C1502Mb d;

    @NotNull
    public final ArrayList e;

    public C0879Eb(@NotNull C4693ja amplitude, @NotNull MI configuration) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = amplitude;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.b = a(configuration, "amplitude-disk-queue", "amplitude-android-" + configuration.d);
        StringBuilder sb = new StringBuilder("amplitude-identify-intercept-");
        String str = configuration.d;
        sb.append(str);
        this.d = a(configuration, "amplitude-identify-intercept-disk-queue", sb.toString());
        File storageDirectory = configuration.a.getDir(C5491nL.c("amplitude-kotlin-", str), 0);
        DS0 ds0A = configuration.f.a(amplitude);
        String strC = C5491nL.c("amplitude-identity-", str);
        Intrinsics.checkNotNullExpressionValue(storageDirectory, "storageDirectory");
        C1563Mv0 c1563Mv0 = new C1563Mv0(configuration.d, configuration.o, storageDirectory, strC, ds0A);
        arrayList.add(storageDirectory);
        this.c = new C1821Qc0(c1563Mv0);
    }

    public final C1502Mb a(MI mi, String str, String str2) {
        File storageDirectory = mi.a.getDir(str, 0);
        Intrinsics.checkNotNullExpressionValue(storageDirectory, "storageDirectory");
        this.e.add(storageDirectory);
        SharedPreferences sharedPreferences = mi.a.getSharedPreferences(str2, 0);
        C6379rb c6379rb = mi.f;
        C4693ja c4693ja = this.a;
        DS0 ds0A = c6379rb.a(c4693ja);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        return new C1502Mb(mi.d, ds0A, sharedPreferences, storageDirectory, c4693ja.o);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        if (r2.a(r0) == r1) goto L33;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0879Eb.b(LM):java.lang.Object");
    }
}

package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0723Cb {

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

    public C0723Cb(@NotNull C4693ja amplitude, @NotNull MI configuration) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = amplitude;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        configuration.getClass();
        this.b = a(configuration, "amplitude-disk-queue", "amplitude-android-f85374691559c6d41e766cab7118bc7c");
        this.d = a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-f85374691559c6d41e766cab7118bc7c");
        StringBuilder sb = new StringBuilder("amplitude-kotlin-");
        String str = configuration.d;
        sb.append(str);
        File storageDirectory = configuration.a.getDir(sb.toString(), 0);
        DS0 ds0A = amplitude != null ? configuration.f.a(amplitude) : null;
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
        return new C1502Mb("f85374691559c6d41e766cab7118bc7c", ds0A, sharedPreferences, storageDirectory, c4693ja.o);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r2.a(r0) == r1) goto L31;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.C0645Bb
            if (r0 == 0) goto L13
            r0 = r10
            Bb r0 = (defpackage.C0645Bb) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Bb r0 = new Bb
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            Cb r0 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L97
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            Cb r2 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L71
        L3b:
            defpackage.C1795Pt1.b(r10)
            Wv0 r10 = new Wv0
            ja r2 = r9.a
            Qc0 r6 = r2.f()
            Qc0 r7 = r9.c
            DS0 r8 = r2.l
            r10.<init>(r7, r6, r8)
            r10.a()
            LQ1 r10 = r2.g()
            boolean r2 = r10 instanceof defpackage.C1502Mb
            if (r2 == 0) goto L5b
            Mb r10 = (defpackage.C1502Mb) r10
            goto L5c
        L5b:
            r10 = r3
        L5c:
            if (r10 == 0) goto L70
            Kb r2 = new Kb
            Mb r6 = r9.b
            r2.<init>(r6, r10, r8)
            r0.d = r9
            r0.h = r5
            java.lang.Object r10 = r2.a(r0)
            if (r10 != r1) goto L70
            goto L95
        L70:
            r2 = r9
        L71:
            ja r10 = r2.a
            LQ1 r10 = r10.e()
            boolean r5 = r10 instanceof defpackage.C1502Mb
            if (r5 == 0) goto L7e
            r3 = r10
            Mb r3 = (defpackage.C1502Mb) r3
        L7e:
            if (r3 == 0) goto L98
            Kb r10 = new Kb
            ja r5 = r2.a
            DS0 r5 = r5.l
            Mb r6 = r2.d
            r10.<init>(r6, r3, r5)
            r0.d = r2
            r0.h = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L96
        L95:
            return r1
        L96:
            r0 = r2
        L97:
            r2 = r0
        L98:
            java.util.ArrayList r10 = r2.e
            java.util.Iterator r10 = r10.iterator()
        L9e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r10.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String[] r1 = r0.list()
            if (r1 == 0) goto L9e
            int r1 = r1.length
            if (r1 != 0) goto L9e
            r0.delete()
            goto L9e
        Lb7:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0723Cb.b(LM):java.lang.Object");
    }
}

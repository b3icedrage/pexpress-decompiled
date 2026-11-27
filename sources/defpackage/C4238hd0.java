package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4238hd0<T> implements MQ1<T> {

    @NotNull
    public final File a;

    @NotNull
    public final C0974Fg1 b;

    @NotNull
    public final SB0 c;

    @NotNull
    public final C3399dd0 d;

    @NotNull
    public final AtomicBoolean e;

    @NotNull
    public final C4795k21 f;

    public C4238hd0(@NotNull File file, @NotNull C0974Fg1 serializer, @NotNull SB0 coordinator, @NotNull C3399dd0 onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.a = file;
        this.b = serializer;
        this.c = coordinator;
        this.d = onClose;
        this.e = new AtomicBoolean(false);
        this.f = ED.c();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e9 A[Catch: all -> 0x012e, IOException -> 0x0130, TRY_ENTER, TryCatch #4 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013b, B:68:0x0148, B:67:0x0145), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef A[Catch: all -> 0x012e, IOException -> 0x0130, TryCatch #4 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013b, B:68:0x0148, B:67:0x0145), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0101 A[Catch: all -> 0x012e, IOException -> 0x0130, TryCatch #4 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013b, B:68:0x0148, B:67:0x0145), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0106 A[Catch: all -> 0x012e, IOException -> 0x0130, TryCatch #4 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013b, B:68:0x0148, B:67:0x0145), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d A[Catch: all -> 0x012e, IOException -> 0x0130, TryCatch #4 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013b, B:68:0x0148, B:67:0x0145), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x013b A[Catch: all -> 0x012e, IOException -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x0130, blocks: (B:44:0x00e9, B:46:0x00ef, B:48:0x0101, B:52:0x010d, B:53:0x012d, B:49:0x0106, B:61:0x013b, B:68:0x0148, B:67:0x0145), top: B:86:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x010d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.MQ1
    @Nullable
    public final Object c(@NotNull C3365dT c3365dT, @NotNull LM lm) throws IOException {
        C4028gd0 c4028gd0;
        File file;
        C4238hd0<T> c4238hd0;
        InterfaceC4117h21 interfaceC4117h21;
        Function2 function2;
        C5339md0 c5339md0;
        Throwable th;
        C5339md0 c5339md1;
        File file2;
        C4238hd0<T> c4238hd1;
        File toFile;
        boolean zRenameTo;
        if (lm instanceof C4028gd0) {
            c4028gd0 = (C4028gd0) lm;
            int i = c4028gd0.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4028gd0.k = i - Integer.MIN_VALUE;
            } else {
                c4028gd0 = new C4028gd0(this, lm);
            }
        } else {
            c4028gd0 = new C4028gd0(this, lm);
        }
        Object obj = c4028gd0.i;
        MN mn = MN.d;
        int i2 = c4028gd0.k;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            C1795Pt1.b(obj);
                            if (this.e.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file3 = this.a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException("Unable to create parent directories of " + file3);
                                }
                            }
                            c4028gd0.d = this;
                            c4028gd0.e = c3365dT;
                            C4795k21 c4795k21 = this.f;
                            c4028gd0.g = c4795k21;
                            c4028gd0.k = 1;
                            if (c4795k21.a(c4028gd0) != mn) {
                                c4238hd0 = this;
                                interfaceC4117h21 = c4795k21;
                                function2 = c3365dT;
                            }
                            return mn;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c5339md1 = c4028gd0.h;
                            File file4 = (File) c4028gd0.g;
                            interfaceC4117h21 = (InterfaceC4117h21) c4028gd0.e;
                            c4238hd1 = c4028gd0.d;
                            try {
                                C1795Pt1.b(obj);
                                file2 = file4;
                                Unit unit = Unit.a;
                                try {
                                    c5339md1.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    toFile = c4238hd1.a;
                                    Intrinsics.checkNotNullParameter(file2, "<this>");
                                    Intrinsics.checkNotNullParameter(toFile, "toFile");
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = C3398dd.a(file2, toFile);
                                    } else {
                                        zRenameTo = file2.renameTo(toFile);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + c4238hd1.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                Unit unit2 = Unit.a;
                                interfaceC4117h21.b(null);
                                return Unit.a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    c5339md1.close();
                                } catch (Throwable th4) {
                                    J90.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        InterfaceC4117h21 interfaceC4117h22 = (InterfaceC4117h21) c4028gd0.g;
                        Function2 function3 = (Function2) c4028gd0.e;
                        c4238hd0 = c4028gd0.d;
                        C1795Pt1.b(obj);
                        interfaceC4117h21 = interfaceC4117h22;
                        function2 = function3;
                        c4028gd0.d = c4238hd0;
                        c4028gd0.e = interfaceC4117h21;
                        c4028gd0.g = file;
                        c4028gd0.h = c5339md0;
                        c4028gd0.k = 2;
                        if (function2.invoke(c5339md0, c4028gd0) != mn) {
                            file2 = file;
                            c4238hd1 = c4238hd0;
                            c5339md1 = c5339md0;
                            Unit unit3 = Unit.a;
                            c5339md1.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                toFile = c4238hd1.a;
                                Intrinsics.checkNotNullParameter(file2, "<this>");
                                Intrinsics.checkNotNullParameter(toFile, "toFile");
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = C3398dd.a(file2, toFile);
                                } else {
                                    zRenameTo = file2.renameTo(toFile);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + file2 + " to " + c4238hd1.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            Unit unit4 = Unit.a;
                            interfaceC4117h21.b(null);
                            return Unit.a;
                        }
                        return mn;
                    } catch (Throwable th5) {
                        th = th5;
                        c5339md1 = c5339md0;
                        c5339md1.close();
                        throw th;
                    }
                    C0974Fg1 serializer = c4238hd0.b;
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(serializer, "serializer");
                    c5339md0 = new C5339md0(file, serializer);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(c4238hd0.a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                interfaceC4117h21.b(null);
                throw th6;
            }
        } catch (IOException e2) {
            e = e2;
            file = mn;
        }
    }

    @Override // defpackage.InterfaceC5680oE
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:55:0x0020, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [hd0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [hd0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [fd0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [hd0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [NQ1] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.MQ1
    @Nullable
    public final Object d(@NotNull NQ1 nq1, @NotNull LM lm) throws Throwable {
        ?? c3818fd0;
        Throwable th;
        C2397Xc0 c2397Xc0;
        ?? r8;
        ?? r0;
        if (lm instanceof C3818fd0) {
            C3818fd0 c3818fd1 = (C3818fd0) lm;
            int i = c3818fd1.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3818fd1.j = i - Integer.MIN_VALUE;
                c3818fd0 = c3818fd1;
            } else {
                c3818fd0 = new C3818fd0(this, lm);
            }
        } else {
            c3818fd0 = new C3818fd0(this, lm);
        }
        Object obj = c3818fd0.h;
        MN mn = MN.d;
        int i2 = c3818fd0.j;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nq1 = c3818fd0.g;
                c2397Xc0 = c3818fd0.e;
                c3818fd0 = c3818fd0.d;
                try {
                    C1795Pt1.b(obj);
                    r0 = c3818fd0;
                    r8 = nq1;
                    try {
                        c2397Xc0.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r0.f.b(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c2397Xc0.close();
                    } catch (Throwable th4) {
                        J90.a(th, th4);
                    }
                    throw th;
                }
            }
            C1795Pt1.b(obj);
            if (this.e.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zE = this.f.e();
            try {
                C2397Xc0 c2397Xc1 = new C2397Xc0(this.a, this.b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zE);
                    c3818fd0.d = this;
                    c3818fd0.e = c2397Xc1;
                    c3818fd0.g = zE;
                    c3818fd0.j = 1;
                    Object objK = nq1.k(c2397Xc1, boolValueOf, c3818fd0);
                    if (objK == mn) {
                        return mn;
                    }
                    obj = objK;
                    r8 = zE;
                    r0 = this;
                    c2397Xc0 = c2397Xc1;
                    c2397Xc0.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        r0.f.b(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    nq1 = zE;
                    c3818fd0 = this;
                    c2397Xc0 = c2397Xc1;
                    c2397Xc0.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                nq1 = zE;
                c3818fd0 = this;
                if (nq1 != 0) {
                    c3818fd0.f.b(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (nq1 != 0) {
                c3818fd0.f.b(null);
            }
            throw th;
        }
    }

    @Override // defpackage.MQ1
    @NotNull
    public final SB0 e() {
        return this.c;
    }
}

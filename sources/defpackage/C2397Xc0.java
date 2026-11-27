package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2397Xc0<T> implements InterfaceC1151Hn1<T> {

    @NotNull
    public final File a;

    @NotNull
    public final C0974Fg1 b;

    @NotNull
    public final AtomicBoolean c;

    public C2397Xc0(@NotNull File file, @NotNull C0974Fg1 serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.a = file;
        this.b = serializer;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [Xc0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [Xc0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [Xc0] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(defpackage.C2397Xc0 r8, defpackage.LM r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C2293Wc0
            if (r0 == 0) goto L13
            r0 = r9
            Wc0 r0 = (defpackage.C2293Wc0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            Wc0 r0 = new Wc0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.d
            java.io.Closeable r8 = (java.io.Closeable) r8
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Throwable -> L30
            goto La5
        L30:
            r9 = move-exception
            goto La9
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.io.FileInputStream r8 = r0.e
            java.lang.Object r2 = r0.d
            Xc0 r2 = (defpackage.C2397Xc0) r2
            defpackage.C1795Pt1.b(r9)     // Catch: java.lang.Throwable -> L45
            goto L70
        L45:
            r9 = move-exception
            goto L7d
        L47:
            defpackage.C1795Pt1.b(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.c
            boolean r9 = r9.get()
            if (r9 != 0) goto Lb8
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L83
            java.io.File r2 = r8.a     // Catch: java.io.FileNotFoundException -> L83
            r9.<init>(r2)     // Catch: java.io.FileNotFoundException -> L83
            java.io.FileInputStream r9 = io.sentry.instrumentation.file.f.a.a(r2, r9)     // Catch: java.io.FileNotFoundException -> L83
            Fg1 r2 = r8.b     // Catch: java.lang.Throwable -> L7b
            r0.d = r8     // Catch: java.lang.Throwable -> L7b
            r0.e = r9     // Catch: java.lang.Throwable -> L7b
            r0.i = r3     // Catch: java.lang.Throwable -> L7b
            Y11 r2 = r2.a(r9)     // Catch: java.lang.Throwable -> L7b
            if (r2 != r1) goto L6c
            goto La4
        L6c:
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r7
        L70:
            defpackage.C6621sj.b(r8, r5)     // Catch: java.io.FileNotFoundException -> L74
            return r9
        L74:
            r8 = r2
            goto L83
        L76:
            r7 = r2
            r2 = r8
            r8 = r9
            r9 = r7
            goto L7d
        L7b:
            r2 = move-exception
            goto L76
        L7d:
            throw r9     // Catch: java.lang.Throwable -> L7e
        L7e:
            r6 = move-exception
            defpackage.C6621sj.b(r8, r9)     // Catch: java.io.FileNotFoundException -> L74
            throw r6     // Catch: java.io.FileNotFoundException -> L74
        L83:
            java.io.File r9 = r8.a
            boolean r9 = r9.exists()
            Fg1 r2 = r8.b
            if (r9 == 0) goto Laf
            java.io.FileInputStream r9 = new java.io.FileInputStream
            java.io.File r8 = r8.a
            r9.<init>(r8)
            java.io.FileInputStream r8 = io.sentry.instrumentation.file.f.a.a(r8, r9)
            r0.d = r8     // Catch: java.lang.Throwable -> L30
            r0.e = r5     // Catch: java.lang.Throwable -> L30
            r0.i = r4     // Catch: java.lang.Throwable -> L30
            Y11 r9 = r2.a(r8)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto La5
        La4:
            return r1
        La5:
            defpackage.C6621sj.b(r8, r5)
            return r9
        La9:
            throw r9     // Catch: java.lang.Throwable -> Laa
        Laa:
            r0 = move-exception
            defpackage.C6621sj.b(r8, r9)
            throw r0
        Laf:
            r2.getClass()
            Y11 r8 = new Y11
            r8.<init>(r3, r3)
            return r8
        Lb8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This scope has already been closed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2397Xc0.f(Xc0, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1151Hn1
    @Nullable
    public final Object b(@NotNull NQ1 nq1) {
        return f(this, nq1);
    }

    @Override // defpackage.InterfaceC5680oE
    public final void close() {
        this.c.set(true);
    }
}

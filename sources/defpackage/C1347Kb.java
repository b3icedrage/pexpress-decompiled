package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1347Kb {

    @NotNull
    public final C1502Mb a;

    @NotNull
    public final C1502Mb b;

    @NotNull
    public final DS0 c;

    public C1347Kb(@NotNull C1502Mb source, @NotNull C1502Mb destination, @NotNull DS0 logger) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = source;
        this.b = destination;
        this.c = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r2.d(r0) == r1) goto L22;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C1035Gb
            if (r0 == 0) goto L13
            r0 = r6
            Gb r0 = (defpackage.C1035Gb) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Gb r0 = new Gb
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r6)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            Kb r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L47
        L38:
            defpackage.C1795Pt1.b(r6)
            r0.d = r5
            r0.h = r4
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            r2 = r5
        L47:
            r6 = 0
            r0.d = r6
            r0.h = r3
            java.lang.Object r6 = r2.d(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1347Kb.a(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a4 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:33:0x007c, B:42:0x0096, B:44:0x00a4, B:46:0x00b7), top: B:76:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[Catch: Exception -> 0x0080, TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:33:0x007c, B:42:0x0096, B:44:0x00a4, B:46:0x00b7), top: B:76:0x007c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[Catch: Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, blocks: (B:15:0x0032, B:55:0x00fc, B:57:0x0102, B:65:0x012e, B:66:0x015c, B:48:0x00be, B:50:0x00c5, B:54:0x00e8, B:67:0x018f), top: B:83:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0102 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #4 {Exception -> 0x0037, blocks: (B:15:0x0032, B:55:0x00fc, B:57:0x0102, B:65:0x012e, B:66:0x015c, B:48:0x00be, B:50:0x00c5, B:54:0x00e8, B:67:0x018f), top: B:83:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x018f A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #4 {Exception -> 0x0037, blocks: (B:15:0x0032, B:55:0x00fc, B:57:0x0102, B:65:0x012e, B:66:0x015c, B:48:0x00be, B:50:0x00c5, B:54:0x00e8, B:67:0x018f), top: B:83:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Hb, LM] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00e8 -> B:55:0x00fc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.LM r18) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1347Kb.b(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r0.h(r11, r12) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        if (kotlin.Unit.a == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [Mb] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(LQ1.a r11, defpackage.LM r12) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1347Kb.c(LQ1$a, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[PHI: r2
      0x0073: PHI (r2v5 Kb) = (r2v3 Kb), (r2v6 Kb) binds: [B:24:0x0070, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0081 A[PHI: r2
      0x0081: PHI (r2v7 Kb) = (r2v5 Kb), (r2v8 Kb) binds: [B:27:0x007e, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[PHI: r2
      0x008f: PHI (r2v9 Kb) = (r2v7 Kb), (r2v10 Kb) binds: [B:30:0x008c, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x009d A[PHI: r2
      0x009d: PHI (r2v11 Kb) = (r2v9 Kb), (r2v12 Kb) binds: [B:33:0x009a, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[PHI: r2
      0x00ab: PHI (r2v13 Kb) = (r2v11 Kb), (r2v14 Kb) binds: [B:36:0x00a8, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r2.c(r5, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.LM r5) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1347Kb.d(LM):java.lang.Object");
    }
}

package defpackage;

import io.sentry.ILogger;
import io.sentry.hints.l;
import io.sentry.util.p;
import java.io.File;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: v70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7126v70 extends S10 {

    @NotNull
    public final SD1 e;

    @NotNull
    public final InterfaceC1560Mu0 f;

    @NotNull
    public final ILogger g;

    public C7126v70(@NotNull SD1 sd1, @NotNull InterfaceC1560Mu0 interfaceC1560Mu0, @NotNull ILogger iLogger, long j, int i) {
        super(sd1, iLogger, j, i);
        p.b(sd1, "Scopes are required.");
        this.e = sd1;
        p.b(interfaceC1560Mu0, "Serializer is required.");
        this.f = interfaceC1560Mu0;
        p.b(iLogger, "Logger is required.");
        this.g = iLogger;
    }

    public static void c(C7126v70 c7126v70, File file, l lVar) {
        c7126v70.getClass();
        boolean zA = lVar.a();
        ILogger iLogger = c7126v70.g;
        if (zA) {
            iLogger.a(NG1.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.a(NG1.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            iLogger.c(NG1.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.a(NG1.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // defpackage.S10
    public final boolean a(@NotNull String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
    
        c(r8, r9, (io.sentry.hints.l) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0160, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
    
        return;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // defpackage.S10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@org.jetbrains.annotations.NotNull java.io.File r9, @org.jetbrains.annotations.NotNull defpackage.C0841Do0 r10) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7126v70.b(java.io.File, Do0):void");
    }
}

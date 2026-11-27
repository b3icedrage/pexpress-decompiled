package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Vq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2253Vq0 {

    @NotNull
    public static final b a = new b();

    @NotNull
    public static final C2498Yk<C2253Vq0> b = new C2498Yk<>("HttpRedirect");

    @NotNull
    public static final C4466ii c = new C4466ii();

    /* JADX INFO: renamed from: Vq0$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: Vq0$b */
    public static final class b implements InterfaceC4755jq0<a, C2253Vq0> {
        /* JADX WARN: Code duplicated, block: B:36:0x010b  */
        /* JADX WARN: Code duplicated, block: B:40:0x0171  */
        /* JADX WARN: Code duplicated, block: B:43:0x0189  */
        /* JADX WARN: Code duplicated, block: B:46:0x0194  */
        /* JADX WARN: Code duplicated, block: B:57:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:60:0x0217 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:61:0x0218  */
        /* JADX WARN: Code duplicated, block: B:64:0x0232  */
        /* JADX WARN: Code duplicated, block: B:66:0x0235  */
        /* JADX WARN: Code duplicated, block: B:7:0x001c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v7, types: [JF1] */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v13 */
        /* JADX WARN: Type inference failed for: r13v9, types: [T, br0] */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v23, types: [T] */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r21v0, types: [T, Vp0, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v0, types: [T] */
        /* JADX WARN: Type inference failed for: r8v1, types: [br0] */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0218 -> B:62:0x021e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static final java.lang.Object c(defpackage.C2253Vq0.b r18, defpackage.JF1 r19, defpackage.C3032br0 r20, defpackage.C2250Vp0 r21, defpackage.C1782Pp0 r22, defpackage.LM r23) {
            /*
                Method dump skipped, instruction units count: 573
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C2253Vq0.b.c(Vq0$b, JF1, br0, Vp0, Pp0, LM):java.lang.Object");
        }

        @Override // defpackage.InterfaceC4755jq0
        public final void a(C2253Vq0 c2253Vq0, C1782Pp0 scope) {
            C2253Vq0 plugin = c2253Vq0;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            C6860tr0.d dVar = C6860tr0.b;
            C6860tr0 c6860tr0 = (C6860tr0) C4965kq0.a(scope);
            C2439Xq0 block = new C2439Xq0(plugin, scope, null);
            Intrinsics.checkNotNullParameter(block, "block");
            c6860tr0.a.add(block);
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C2253Vq0 b(Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke(new a());
            return new C2253Vq0();
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C2253Vq0> getKey() {
            return C2253Vq0.b;
        }
    }
}

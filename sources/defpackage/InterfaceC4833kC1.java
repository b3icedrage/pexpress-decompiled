package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4833kC1 {

    /* JADX INFO: renamed from: kC1$a */
    public static final class a {
        public static String a(Throwable th) {
            String[] elements = {th.getClass().getSimpleName(), th.getMessage()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return KS1.B(HttpPlatformResponse.MAX_MESSAGE_LENGTH, CollectionsKt.J(C1526Mj.o(elements), ": ", null, null, null, 62));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        
            if (r5 == r1) goto L44;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [kC1, rC1] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v2, types: [kC1] */
        /* JADX WARN: Type inference failed for: r6v4, types: [kC1] */
        /* JADX WARN: Type inference failed for: r6v8 */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.JM r5, @org.jetbrains.annotations.NotNull defpackage.AbstractC6305rC1 r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r7) {
            /*
                boolean r0 = r5 instanceof defpackage.C5256mC1
                if (r0 == 0) goto L13
                r0 = r5
                mC1 r0 = (defpackage.C5256mC1) r0
                int r1 = r0.g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.g = r1
                goto L18
            L13:
                mC1 r0 = new mC1
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.e
                MN r1 = defpackage.MN.d
                int r2 = r0.g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3b
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2b
                defpackage.C1795Pt1.b(r5)
                goto Laf
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                kC1 r6 = r0.d
                defpackage.C1795Pt1.b(r5)     // Catch: defpackage.C6437rq0 -> L39 java.lang.Throwable -> L4c java.net.UnknownHostException -> L4e java.net.ConnectException -> L50 java.io.InterruptedIOException -> L52 java.util.concurrent.CancellationException -> L97
                goto L49
            L39:
                r5 = move-exception
                goto L6e
            L3b:
                defpackage.C1795Pt1.b(r5)
                r0.d = r6     // Catch: defpackage.C6437rq0 -> L39 java.lang.Throwable -> L4c java.net.UnknownHostException -> L4e java.net.ConnectException -> L50 java.io.InterruptedIOException -> L52 java.util.concurrent.CancellationException -> L97
                r0.g = r4     // Catch: defpackage.C6437rq0 -> L39 java.lang.Throwable -> L4c java.net.UnknownHostException -> L4e java.net.ConnectException -> L50 java.io.InterruptedIOException -> L52 java.util.concurrent.CancellationException -> L97
                java.lang.Object r5 = r7.invoke(r0)     // Catch: defpackage.C6437rq0 -> L39 java.lang.Throwable -> L4c java.net.UnknownHostException -> L4e java.net.ConnectException -> L50 java.io.InterruptedIOException -> L52 java.util.concurrent.CancellationException -> L97
                if (r5 != r1) goto L49
                goto Lae
            L49:
                com.api.core.backend.domain.models.resultModels.CommonResult r5 = (com.api.core.backend.domain.models.resultModels.CommonResult) r5     // Catch: defpackage.C6437rq0 -> L39 java.lang.Throwable -> L4c java.net.UnknownHostException -> L4e java.net.ConnectException -> L50 java.io.InterruptedIOException -> L52 java.util.concurrent.CancellationException -> L97
                return r5
            L4c:
                r5 = move-exception
                goto L54
            L4e:
                r5 = move-exception
                goto L60
            L50:
                r5 = move-exception
                goto L7b
            L52:
                r5 = move-exception
                goto L89
            L54:
                Vg r6 = defpackage.U0.S
                if (r6 == 0) goto L5b
                r6.invoke(r5)
            L5b:
                com.api.core.backend.domain.models.resultModels.ResultError r5 = d(r5)
                goto Lb1
            L60:
                com.api.core.backend.domain.models.resultModels.CommonError$NotWebSocketConnection r6 = new com.api.core.backend.domain.models.resultModels.CommonError$NotWebSocketConnection
                r6.<init>()
                r6.setCause(r5)
                com.api.core.backend.domain.models.resultModels.ResultError r5 = new com.api.core.backend.domain.models.resultModels.ResultError
                r5.<init>(r6)
                goto Lb1
            L6e:
                com.api.core.backend.domain.models.resultModels.ResultError r6 = r6.z(r5)
                com.api.core.backend.domain.models.resultModels.CommonError r7 = r6.getError()
                r7.setCause(r5)
                r5 = r6
                goto Lb1
            L7b:
                com.api.core.backend.domain.models.resultModels.CommonError$NotWebSocketConnection r6 = new com.api.core.backend.domain.models.resultModels.CommonError$NotWebSocketConnection
                r6.<init>()
                r6.setCause(r5)
                com.api.core.backend.domain.models.resultModels.ResultError r5 = new com.api.core.backend.domain.models.resultModels.ResultError
                r5.<init>(r6)
                goto Lb1
            L89:
                com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException r6 = new com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException
                r6.<init>()
                r6.setCause(r5)
                com.api.core.backend.domain.models.resultModels.ResultError r5 = new com.api.core.backend.domain.models.resultModels.ResultError
                r5.<init>(r6)
                goto Lb1
            L97:
                r5 = 0
                r0.d = r5
                r0.g = r3
                kotlin.coroutines.CoroutineContext r5 = r0.getContext()
                defpackage.ED.h(r5)
                com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException r5 = new com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException
                r5.<init>()
                com.api.core.backend.domain.models.resultModels.ResultError r5 = r6.l(r5)
                if (r5 != r1) goto Laf
            Lae:
                return r1
            Laf:
                com.api.core.backend.domain.models.resultModels.CommonResult r5 = (com.api.core.backend.domain.models.resultModels.CommonResult) r5
            Lb1:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.InterfaceC4833kC1.a.b(JM, rC1, kotlin.jvm.functions.Function1):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        
            if (r6 == r1) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [kC1, rC1] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v2, types: [kC1] */
        /* JADX WARN: Type inference failed for: r7v4, types: [kC1] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object c(@org.jetbrains.annotations.NotNull defpackage.JM r6, @org.jetbrains.annotations.NotNull defpackage.AbstractC6305rC1 r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r8) {
            /*
                boolean r0 = r6 instanceof defpackage.C5466nC1
                if (r0 == 0) goto L13
                r0 = r6
                nC1 r0 = (defpackage.C5466nC1) r0
                int r1 = r0.g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.g = r1
                goto L18
            L13:
                nC1 r0 = new nC1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.e
                MN r1 = defpackage.MN.d
                int r2 = r0.g
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3e
                if (r2 == r5) goto L34
                if (r2 != r4) goto L2c
                defpackage.C1795Pt1.b(r6)
                goto L9c
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kC1 r7 = r0.d
                defpackage.C1795Pt1.b(r6)     // Catch: defpackage.C6437rq0 -> L3a java.net.ConnectException -> L3c java.lang.Throwable -> L52 java.util.concurrent.CancellationException -> L85
                goto L4c
            L3a:
                r6 = move-exception
                goto L5f
            L3c:
                r6 = move-exception
                goto L6c
            L3e:
                defpackage.C1795Pt1.b(r6)
                r0.d = r7     // Catch: defpackage.C6437rq0 -> L3a java.net.ConnectException -> L3c java.lang.Throwable -> L52 java.util.concurrent.CancellationException -> L85
                r0.g = r5     // Catch: defpackage.C6437rq0 -> L3a java.net.ConnectException -> L3c java.lang.Throwable -> L52 java.util.concurrent.CancellationException -> L85
                java.lang.Object r6 = r8.invoke(r0)     // Catch: defpackage.C6437rq0 -> L3a java.net.ConnectException -> L3c java.lang.Throwable -> L52 java.util.concurrent.CancellationException -> L85
                if (r6 != r1) goto L4c
                goto L9b
            L4c:
                com.api.core.backend.domain.models.resultModels.ResultOk r8 = new com.api.core.backend.domain.models.resultModels.ResultOk     // Catch: defpackage.C6437rq0 -> L3a java.net.ConnectException -> L3c java.lang.Throwable -> L52 java.util.concurrent.CancellationException -> L85
                r8.<init>(r6)     // Catch: defpackage.C6437rq0 -> L3a java.net.ConnectException -> L3c java.lang.Throwable -> L52 java.util.concurrent.CancellationException -> L85
                return r8
            L52:
                r6 = move-exception
                Vg r7 = defpackage.U0.S
                if (r7 == 0) goto L5a
                r7.invoke(r6)
            L5a:
                com.api.core.backend.domain.models.resultModels.ResultError r6 = d(r6)
                goto L9e
            L5f:
                com.api.core.backend.domain.models.resultModels.ResultError r7 = r7.z(r6)
                com.api.core.backend.domain.models.resultModels.CommonError r8 = r7.getError()
                r8.setCause(r6)
                r6 = r7
                goto L9e
            L6c:
                com.api.core.backend.domain.models.resultModels.CommonError$Companion r7 = com.api.core.backend.domain.models.resultModels.CommonError.INSTANCE
                com.api.core.backend.domain.models.resultModels.CommonError$Codes r8 = com.api.core.backend.domain.models.resultModels.CommonError.Codes.VPN
                int r8 = r8.getValue()
                java.lang.String r0 = a(r6)
                com.api.core.backend.domain.models.resultModels.CommonError r7 = com.api.core.backend.domain.models.resultModels.CommonError.Companion.b(r7, r8, r3, r0, r4)
                r7.setCause(r6)
                com.api.core.backend.domain.models.resultModels.ResultError r6 = new com.api.core.backend.domain.models.resultModels.ResultError
                r6.<init>(r7)
                goto L9e
            L85:
                r0.d = r3
                r0.g = r4
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                defpackage.ED.h(r6)
                com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException r6 = new com.api.core.backend.domain.models.resultModels.CommonError$TimeoutException
                r6.<init>()
                com.api.core.backend.domain.models.resultModels.ResultError r6 = r7.l(r6)
                if (r6 != r1) goto L9c
            L9b:
                return r1
            L9c:
                com.api.core.backend.domain.models.resultModels.CommonResult r6 = (com.api.core.backend.domain.models.resultModels.CommonResult) r6
            L9e:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.InterfaceC4833kC1.a.c(JM, rC1, kotlin.jvm.functions.Function1):java.lang.Object");
        }

        public static ResultError d(Throwable th) {
            CommonError.Companion companion = CommonError.INSTANCE;
            int value = CommonError.Codes.UnexpectedError.getValue();
            String simpleName = th.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            String strA = a(th);
            companion.getClass();
            CommonError commonErrorA = CommonError.Companion.a(value, simpleName, strA);
            commonErrorA.setCause(th);
            return new ResultError(commonErrorA);
        }
    }

    @Nullable
    <T> Object e(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm);

    @NotNull
    ResultError l(@NotNull CommonError commonError);

    @NotNull
    ResultError m(@NotNull String str);

    @Nullable
    <T extends HttpResponse<?>> Object o(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm);

    @Nullable
    <T> Object t(@NotNull Function1<? super JM<? super CommonResult<? extends T>>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm);

    @Nullable
    <T> Object w(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm);

    @NotNull
    ResultError z(@NotNull C6437rq0 c6437rq0);
}

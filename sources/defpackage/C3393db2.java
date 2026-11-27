package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.google.gson.Gson;
import com.impl.core.backend.responseModels.AppData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: db2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.UserDataSourceImpl$fetchPlatformUser$page$1", f = "UserDataSourceImpl.kt", l = {67}, m = "invokeSuspend")
public final class C3393db2 extends AW1 implements Function1<JM<? super C2750ab2.a>, Object> {
    public int d;
    public final /* synthetic */ C7698xq0 e;
    public final /* synthetic */ C2750ab2 g;
    public final /* synthetic */ C6315rG h;

    /* JADX INFO: renamed from: db2$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.UserDataSourceImpl$fetchPlatformUser$page$1$1", f = "UserDataSourceImpl.kt", l = {68}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super C2750ab2.a>, Object> {
        public int d;
        public final /* synthetic */ C2750ab2 e;
        public final /* synthetic */ C6315rG g;
        public final /* synthetic */ C7698xq0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6315rG c6315rG, JM jm, C7698xq0 c7698xq0, C2750ab2 c2750ab2) {
            super(1, jm);
            this.e = c2750ab2;
            this.g = c6315rG;
            this.h = c7698xq0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.g, jm, this.h, this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super C2750ab2.a> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws IOException {
            Object bVar;
            MN mn = MN.d;
            int i = this.d;
            C2750ab2 c2750ab2 = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC7864ye1 interfaceC7864ye1 = c2750ab2.e;
                String strF = c2750ab2.f.f();
                String str = this.g.a;
                this.d = 1;
                obj = interfaceC7864ye1.j(strF, str, this.h, this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C0935Et1 c0935Et1 = (C0935Et1) obj;
            AbstractC1091Gt1 abstractC1091Gt1 = (AbstractC1091Gt1) c0935Et1.b;
            if (abstractC1091Gt1 != null) {
                C0857Dt1 c0857Dt1 = c0935Et1.a;
                if (!c0857Dt1.g()) {
                    abstractC1091Gt1 = null;
                }
                if (abstractC1091Gt1 != null) {
                    if (C7652xe.i(abstractC1091Gt1)) {
                        String strL = abstractC1091Gt1.l();
                        CommonError commonErrorA = C1358Ke1.a(strL);
                        if (commonErrorA != null) {
                            return new C2750ab2.a.b(commonErrorA);
                        }
                        Gson gson = new Gson();
                        Intrinsics.checkNotNullParameter(gson, "gson");
                        Object objD = gson.d(AppData.class, C1589Ne.n(new BufferedReader(new StringReader(strL), 8192)));
                        String.valueOf(objD);
                        return new C2750ab2.a.C0216a((AppData) objD);
                    }
                    Intrinsics.checkNotNullExpressionValue(c0857Dt1, "raw(...)");
                    c2750ab2.getClass();
                    try {
                        if (C0968Fe1.a(c0857Dt1)) {
                            CommonError.Companion companion = CommonError.INSTANCE;
                            int value = CommonError.Codes.NotAuthenticated.getValue();
                            companion.getClass();
                            C2750ab2.a.b bVar2 = new C2750ab2.a.b(CommonError.Companion.a(value, "Login page", "login_page"));
                            abstractC1091Gt1.close();
                            return bVar2;
                        }
                        try {
                            InputStream inputStreamR1 = abstractC1091Gt1.k().r1();
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamR1, Charsets.UTF_8), 8192);
                                try {
                                    Gson gson2 = new Gson();
                                    Intrinsics.checkNotNullParameter(gson2, "gson");
                                    Object objD2 = gson2.d(AppData.class, C1589Ne.n(bufferedReader));
                                    String.valueOf(objD2);
                                    bufferedReader.close();
                                    inputStreamR1.close();
                                    bVar = new C2750ab2.a.C0216a((AppData) objD2);
                                    abstractC1091Gt1.close();
                                    return bVar;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        C6621sj.b(bufferedReader, th);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    C6621sj.b(inputStreamR1, th3);
                                    throw th4;
                                }
                            }
                        } catch (C1511Me unused) {
                            C1318Jr0 c1318Jr0 = c0857Dt1.d.a;
                            CommonError.Companion companion2 = CommonError.INSTANCE;
                            int value2 = CommonError.Codes.UnexpectedError.getValue();
                            String str2 = "platform_foreign_page:" + c1318Jr0.d + c1318Jr0.b();
                            companion2.getClass();
                            bVar = new C2750ab2.a.b(CommonError.Companion.a(value2, "No profile on the platform page", str2));
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            C6621sj.b(abstractC1091Gt1, th5);
                            throw th6;
                        }
                    }
                }
            }
            throw new C6437rq0(c0935Et1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3393db2(C6315rG c6315rG, JM jm, C7698xq0 c7698xq0, C2750ab2 c2750ab2) {
        super(1, jm);
        this.e = c7698xq0;
        this.g = c2750ab2;
        this.h = c6315rG;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C3393db2(this.h, jm, this.e, this.g);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super C2750ab2.a> jm) {
        return ((C3393db2) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        C7698xq0 c7698xq0 = this.e;
        a aVar = new a(this.h, null, c7698xq0, this.g);
        this.d = 1;
        Object objA = c7698xq0.a(aVar, this);
        return objA == mn ? mn : objA;
    }
}

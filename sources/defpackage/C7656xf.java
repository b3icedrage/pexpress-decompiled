package defpackage;

import com.api.core.backend.domain.models.requestModels.ConfigRequest;
import com.api.core.backend.domain.models.responseModels.ConfigResponse;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.data_sources.AppDataSourceBase$fetchConfig$2", f = "AppDataSourceBase.kt", l = {48, 58}, m = "invokeSuspend")
public final class C7656xf extends AW1 implements Function1<JM<? super ConfigResponse>, Object> {
    public ConfigResponse d;
    public String e;
    public String g;
    public long h;
    public int i;
    public final /* synthetic */ AbstractC7866yf j;
    public final /* synthetic */ ConfigRequest k;

    /* JADX INFO: renamed from: xf$a */
    @InterfaceC3368dU(c = "com.base.core.backend.data_sources.AppDataSourceBase$fetchConfig$2$probe$1", f = "AppDataSourceBase.kt", l = {59}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super W91>, Object> {
        public W91.a d;
        public int e;
        public final /* synthetic */ AbstractC7866yf g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC7866yf abstractC7866yf, String str, JM<? super a> jm) {
            super(2, jm);
            this.g = abstractC7866yf;
            this.h = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.g, this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super W91> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            W91.a aVar;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                W91.a aVar2 = W91.a;
                InterfaceC7007ua1 interfaceC7007ua1 = this.g.b;
                C1078Gp0 c1078Gp0 = AbstractC7866yf.e;
                this.d = aVar2;
                this.e = 1;
                Object objG = interfaceC7007ua1.g(this.h, c1078Gp0, this);
                if (objG == mn) {
                    return mn;
                }
                aVar = aVar2;
                obj = objG;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = this.d;
                C1795Pt1.b(obj);
            }
            C0935Et1 response = (C0935Et1) obj;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                return W91.a.a(response);
            } finally {
                AbstractC1091Gt1 abstractC1091Gt1 = (AbstractC1091Gt1) response.b;
                if (abstractC1091Gt1 != null) {
                    abstractC1091Gt1.close();
                }
                C1169Ht1 c1169Ht1 = response.c;
                if (c1169Ht1 != null) {
                    c1169Ht1.close();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7656xf(AbstractC7866yf abstractC7866yf, ConfigRequest configRequest, JM<? super C7656xf> jm) {
        super(1, jm);
        this.j = abstractC7866yf;
        this.k = configRequest;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C7656xf(this.j, this.k, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super ConfigResponse> jm) {
        return ((C7656xf) create(jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0144  */
    /* JADX WARN: Code duplicated, block: B:104:0x0148  */
    /* JADX WARN: Code duplicated, block: B:106:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0165  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084 A[Catch: CancellationException -> 0x0024, Exception -> 0x009a, TRY_LEAVE, TryCatch #1 {Exception -> 0x009a, blocks: (B:35:0x0080, B:37:0x0084), top: B:122:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0111  */
    /* JADX WARN: Code duplicated, block: B:83:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x011d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x0126  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0131  */
    /* JADX WARN: Code duplicated, block: B:97:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object objE;
        ConfigResponse configResponse;
        String str;
        String str2;
        long jNanoTime;
        Exception error;
        String str3;
        Object objD;
        String shortUrl;
        long j;
        String str4;
        ConfigResponse configResponse2;
        long j2;
        W91 bVar;
        String probeUrl;
        boolean z;
        W91.c cVar;
        String str5;
        C1676Og c1676Og;
        ConfigResponse.Result result;
        String domain;
        W91.b bVar2;
        W91.c cVar2;
        String str6;
        C7233ve1.a aVar;
        String str7;
        Integer num;
        Throwable th;
        MN mn = MN.d;
        int i = this.i;
        AbstractC7866yf abstractC7866yf = this.j;
        try {
            try {
                if (i == 0) {
                    C1795Pt1.b(obj);
                    InterfaceC7007ua1 interfaceC7007ua1 = abstractC7866yf.b;
                    this.i = 1;
                    objE = interfaceC7007ua1.e(this.k, this);
                    if (objE != mn) {
                    }
                    return mn;
                }
                if (i == 1) {
                    C1795Pt1.b(obj);
                    objE = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.h;
                    str3 = this.g;
                    str = this.e;
                    configResponse = this.d;
                    try {
                        C1795Pt1.b(obj);
                        jNanoTime = j;
                        objD = obj;
                    } catch (Exception e) {
                        error = e;
                        error.getMessage();
                        W91.a.getClass();
                        str4 = "error";
                        Intrinsics.checkNotNullParameter(error, "error");
                        if (error instanceof UnknownHostException) {
                            str4 = "dns";
                        } else if (error instanceof SSLException) {
                            str4 = "tls";
                        } else if (error instanceof InterruptedIOException) {
                            str4 = "timeout";
                        } else if (error instanceof IOException) {
                            str4 = "io";
                        }
                        configResponse2 = configResponse;
                        j2 = j;
                        bVar = new W91.b(str4, null, null, error, 4);
                    }
                }
                try {
                    bVar = (W91) objD;
                    if (bVar == null) {
                        W91.a.getClass();
                        bVar = new W91.b("timeout", null, null, null, 12);
                    }
                    configResponse2 = configResponse;
                    j2 = jNanoTime;
                } catch (Exception e2) {
                    error = e2;
                    j = jNanoTime;
                    error.getMessage();
                    W91.a.getClass();
                    str4 = "error";
                    Intrinsics.checkNotNullParameter(error, "error");
                    if (error instanceof UnknownHostException) {
                        str4 = "dns";
                    } else if (error instanceof SSLException) {
                        str4 = "tls";
                    } else if (error instanceof InterruptedIOException) {
                        str4 = "timeout";
                    } else if (error instanceof IOException) {
                        str4 = "io";
                    }
                    configResponse2 = configResponse;
                    j2 = j;
                    bVar = new W91.b(str4, null, null, error, 4);
                }
                probeUrl = str3;
                z = bVar instanceof W91.c;
                if (z) {
                    cVar = (W91.c) bVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    str5 = cVar.b;
                } else {
                    str5 = null;
                }
                c1676Og = U0.K;
                if (c1676Og != null) {
                    result = configResponse2.getResult();
                    if (result != null) {
                        domain = result.getDomain();
                    } else {
                        domain = null;
                    }
                    boolean z2 = str != null;
                    long jNanoTime2 = (System.nanoTime() - j2) / ((long) 1000000);
                    Intrinsics.checkNotNullParameter(probeUrl, "probeUrl");
                    if (domain != null || StringsKt.I(domain)) {
                        domain = null;
                    }
                    if (bVar instanceof W91.b) {
                        bVar2 = (W91.b) bVar;
                    } else {
                        bVar2 = null;
                    }
                    if (z) {
                        cVar2 = (W91.c) bVar;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null || (str6 = cVar2.b) == null) {
                        str6 = domain;
                    }
                    if (z) {
                        aVar = C7233ve1.a.SHORT_LINK;
                    } else if (domain != null) {
                        aVar = C7233ve1.a.CONFIG;
                    } else {
                        aVar = C7233ve1.a.NONE;
                    }
                    String strA = bVar.a();
                    if (bVar2 != null) {
                        str7 = bVar2.b;
                    } else {
                        str7 = null;
                    }
                    if (bVar2 != null) {
                        num = bVar2.d;
                    } else {
                        num = null;
                    }
                    if (bVar2 != null) {
                        th = bVar2.e;
                    } else {
                        th = null;
                    }
                    c1676Og.invoke(new C7233ve1(str6, aVar, probeUrl, z2, strA, str7, num, th, jNanoTime2));
                }
                if (str5 == null) {
                    return configResponse2;
                }
                ConfigResponse.Result result2 = configResponse2.getResult();
                return new ConfigResponse(result2 != null ? ConfigResponse.Result.a(result2, str5) : null);
                long j3 = AbstractC7866yf.d;
                a aVar2 = new a(abstractC7866yf, str2, null);
                this.d = configResponse;
                this.e = str;
                this.g = str2;
                this.h = jNanoTime;
                this.i = 2;
                objD = OZ1.d(j3, aVar2, this);
                if (objD != mn) {
                    str3 = str2;
                    bVar = (W91) objD;
                    if (bVar == null) {
                        W91.a.getClass();
                        bVar = new W91.b("timeout", null, null, null, 12);
                    }
                    configResponse2 = configResponse;
                    j2 = jNanoTime;
                    probeUrl = str3;
                    z = bVar instanceof W91.c;
                    if (z) {
                        cVar = (W91.c) bVar;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        str5 = cVar.b;
                    } else {
                        str5 = null;
                    }
                    c1676Og = U0.K;
                    if (c1676Og != null) {
                        result = configResponse2.getResult();
                        if (result != null) {
                            domain = result.getDomain();
                        } else {
                            domain = null;
                        }
                        if (str != null) {
                        }
                        long jNanoTime3 = (System.nanoTime() - j2) / ((long) 1000000);
                        Intrinsics.checkNotNullParameter(probeUrl, "probeUrl");
                        if (domain != null) {
                            domain = null;
                        } else {
                            domain = null;
                        }
                        if (bVar instanceof W91.b) {
                            bVar2 = (W91.b) bVar;
                        } else {
                            bVar2 = null;
                        }
                        if (z) {
                            cVar2 = (W91.c) bVar;
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            str6 = domain;
                        } else {
                            str6 = domain;
                        }
                        if (z) {
                            aVar = C7233ve1.a.SHORT_LINK;
                        } else if (domain != null) {
                            aVar = C7233ve1.a.CONFIG;
                        } else {
                            aVar = C7233ve1.a.NONE;
                        }
                        String strA2 = bVar.a();
                        if (bVar2 != null) {
                            str7 = bVar2.b;
                        } else {
                            str7 = null;
                        }
                        if (bVar2 != null) {
                            num = bVar2.d;
                        } else {
                            num = null;
                        }
                        if (bVar2 != null) {
                            th = bVar2.e;
                        } else {
                            th = null;
                        }
                        c1676Og.invoke(new C7233ve1(str6, aVar, probeUrl, z2, strA2, str7, num, th, jNanoTime3));
                    }
                    if (str5 == null) {
                        return configResponse2;
                    }
                    ConfigResponse.Result result3 = configResponse2.getResult();
                    return new ConfigResponse(result3 != null ? ConfigResponse.Result.a(result3, str5) : null);
                }
                return mn;
            } catch (Exception e3) {
                error = e3;
                str3 = str2;
                j = jNanoTime;
                error.getMessage();
                W91.a.getClass();
                str4 = "error";
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof UnknownHostException) {
                    str4 = "dns";
                } else if (error instanceof SSLException) {
                    str4 = "tls";
                } else if (error instanceof InterruptedIOException) {
                    str4 = "timeout";
                } else if (error instanceof IOException) {
                    str4 = "io";
                }
                configResponse2 = configResponse;
                j2 = j;
                bVar = new W91.b(str4, null, null, error, 4);
                probeUrl = str3;
                z = bVar instanceof W91.c;
                if (z) {
                    cVar = (W91.c) bVar;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    str5 = cVar.b;
                } else {
                    str5 = null;
                }
                c1676Og = U0.K;
                if (c1676Og != null) {
                    result = configResponse2.getResult();
                    if (result != null) {
                        domain = result.getDomain();
                    } else {
                        domain = null;
                    }
                    if (str != null) {
                    }
                    long jNanoTime4 = (System.nanoTime() - j2) / ((long) 1000000);
                    Intrinsics.checkNotNullParameter(probeUrl, "probeUrl");
                    if (domain != null) {
                        domain = null;
                    } else {
                        domain = null;
                    }
                    if (bVar instanceof W91.b) {
                        bVar2 = (W91.b) bVar;
                    } else {
                        bVar2 = null;
                    }
                    if (z) {
                        cVar2 = (W91.c) bVar;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        str6 = domain;
                    } else {
                        str6 = domain;
                    }
                    if (z) {
                        aVar = C7233ve1.a.SHORT_LINK;
                    } else if (domain != null) {
                        aVar = C7233ve1.a.CONFIG;
                    } else {
                        aVar = C7233ve1.a.NONE;
                    }
                    String strA3 = bVar.a();
                    if (bVar2 != null) {
                        str7 = bVar2.b;
                    } else {
                        str7 = null;
                    }
                    if (bVar2 != null) {
                        num = bVar2.d;
                    } else {
                        num = null;
                    }
                    if (bVar2 != null) {
                        th = bVar2.e;
                    } else {
                        th = null;
                    }
                    c1676Og.invoke(new C7233ve1(str6, aVar, probeUrl, z2, strA3, str7, num, th, jNanoTime4));
                }
                if (str5 == null) {
                    return configResponse2;
                }
                ConfigResponse.Result result4 = configResponse2.getResult();
                return new ConfigResponse(result4 != null ? ConfigResponse.Result.a(result4, str5) : null);
            }
            configResponse = (ConfigResponse) objE;
            ConfigResponse.Result result5 = configResponse.getResult();
            str = (result5 == null || (shortUrl = result5.getShortUrl()) == null || StringsKt.I(shortUrl)) ? null : shortUrl;
            str2 = str == null ? "https://u3.shortink.io/" : str;
            jNanoTime = System.nanoTime();
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}

package defpackage;

import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8118zq0<T> implements InterfaceC5122lc0<T> {
    public static final C4307hx b;
    public static final C4307hx c;
    public final C4106h a;

    static {
        C4307hx.a aVar = new C4307hx.a();
        aVar.a = true;
        aVar.b = true;
        b = aVar.a();
        C4307hx.a aVar2 = new C4307hx.a();
        aVar2.a = true;
        aVar2.d = true;
        c = aVar2.a();
    }

    public AbstractC8118zq0(@NotNull C4106h callFactory) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        this.a = callFactory;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0141  */
    /* JADX WARN: Code duplicated, block: B:53:0x014d  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:61:0x016f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object d(AbstractC8118zq0 abstractC8118zq0, Object obj, C4695ja1 c4695ja1, LM lm) throws IOException {
        C7908yq0 frame;
        C1318Jr0 url;
        C0857Dt1 response;
        boolean zG;
        AbstractC1091Gt1 body;
        CY0 cy0G;
        String strX;
        String str;
        String strA;
        DS ds;
        if (lm instanceof C7908yq0) {
            frame = (C7908yq0) lm;
            int i = frame.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.e = i - Integer.MIN_VALUE;
            } else {
                frame = new C7908yq0(abstractC8118zq0, lm);
            }
        } else {
            frame = new C7908yq0(abstractC8118zq0, lm);
        }
        Object objQ = frame.d;
        MN mn = MN.d;
        int i2 = frame.e;
        if (i2 == 0) {
            C1795Pt1.b(objQ);
            url = abstractC8118zq0.e(obj);
            C4543is1.a aVar = new C4543is1.a();
            Intrinsics.checkNotNullParameter(url, "url");
            aVar.a = url;
            C2813ao0 headers = c4695ja1.h;
            Intrinsics.checkNotNullParameter(headers, "headers");
            aVar.c = headers.d();
            boolean z = c4695ja1.l.d;
            EnumC5195lx enumC5195lx = c4695ja1.k;
            boolean z2 = enumC5195lx.d;
            if (!z && z2) {
                aVar.c(C4307hx.o);
            } else if (!z || z2) {
                if (!z && !z2) {
                    aVar.c(c);
                }
            } else if (enumC5195lx.e) {
                aVar.c(C4307hx.n);
            } else {
                aVar.c(b);
            }
            boolean z3 = frame.getContext().p(DN.e) instanceof AbstractC8109zn0;
            C4106h c4106h = abstractC8118zq0.a;
            if (!z3) {
                InterfaceC1023Fx interfaceC1023FxA = c4106h.a(aVar.b());
                Intrinsics.checkNotNullExpressionValue(interfaceC1023FxA, "callFactory.newCall(request.build())");
                frame.h = abstractC8118zq0;
                frame.i = url;
                frame.j = interfaceC1023FxA;
                frame.e = 1;
                C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
                c6251qy.r();
                KM km = new KM(interfaceC1023FxA, c6251qy);
                FirebasePerfOkHttpClient.enqueue(interfaceC1023FxA, km);
                c6251qy.u(km);
                objQ = c6251qy.q();
                if (objQ == mn) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objQ == mn) {
                    return mn;
                }
            } else {
                if (z) {
                    throw new NetworkOnMainThreadException();
                }
                response = FirebasePerfOkHttpClient.execute(c4106h.a(aVar.b()));
            }
            Intrinsics.checkNotNullExpressionValue(response, "response");
            zG = response.g();
            body = response.k;
            if (!zG) {
                if (body != null) {
                    body.close();
                }
                Intrinsics.checkNotNullParameter(response, "response");
                throw new C6647sq0("HTTP " + response.h + ": " + response.g);
            }
            if (body != null) {
                throw new IllegalStateException("Null response body!");
            }
            InterfaceC2833av interfaceC2833avK = body.k();
            Intrinsics.checkNotNullExpressionValue(interfaceC2833avK, "body.source()");
            abstractC8118zq0.getClass();
            Intrinsics.checkNotNullParameter(url, "data");
            Intrinsics.checkNotNullParameter(body, "body");
            cy0G = body.g();
            strX = null;
            if (cy0G != null) {
                str = cy0G.a;
            } else {
                str = null;
            }
            if (str != null || d.o(str, "text/plain", false)) {
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                Intrinsics.checkNotNullExpressionValue(singleton, "MimeTypeMap.getSingleton()");
                strA = C4316i.a(singleton, url.i);
                if (strA != null) {
                    strX = strA;
                } else if (str != null) {
                    strX = StringsKt.X(str, ';');
                }
            } else if (str != null) {
                strX = StringsKt.X(str, ';');
            }
            if (response.m != null) {
                ds = DS.g;
            } else {
                ds = DS.h;
            }
            return new ZN1(interfaceC2833avK, strX, ds);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1318Jr0 c1318Jr0 = frame.i;
        AbstractC8118zq0 abstractC8118zq1 = frame.h;
        C1795Pt1.b(objQ);
        url = c1318Jr0;
        abstractC8118zq0 = abstractC8118zq1;
        response = (C0857Dt1) objQ;
        Intrinsics.checkNotNullExpressionValue(response, "response");
        zG = response.g();
        body = response.k;
        if (!zG) {
            if (body != null) {
                body.close();
            }
            Intrinsics.checkNotNullParameter(response, "response");
            throw new C6647sq0("HTTP " + response.h + ": " + response.g);
        }
        if (body != null) {
            throw new IllegalStateException("Null response body!");
        }
        InterfaceC2833av interfaceC2833avK2 = body.k();
        Intrinsics.checkNotNullExpressionValue(interfaceC2833avK2, "body.source()");
        abstractC8118zq0.getClass();
        Intrinsics.checkNotNullParameter(url, "data");
        Intrinsics.checkNotNullParameter(body, "body");
        cy0G = body.g();
        strX = null;
        if (cy0G != null) {
            str = cy0G.a;
        } else {
            str = null;
        }
        if (str != null) {
            MimeTypeMap singleton2 = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNullExpressionValue(singleton2, "MimeTypeMap.getSingleton()");
            strA = C4316i.a(singleton2, url.i);
            if (strA != null) {
                strX = strA;
            } else if (str != null) {
                strX = StringsKt.X(str, ';');
            }
        } else {
            MimeTypeMap singleton3 = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNullExpressionValue(singleton3, "MimeTypeMap.getSingleton()");
            strA = C4316i.a(singleton3, url.i);
            if (strA != null) {
                strX = strA;
            } else if (str != null) {
                strX = StringsKt.X(str, ';');
            }
        }
        if (response.m != null) {
            ds = DS.g;
        } else {
            ds = DS.h;
        }
        return new ZN1(interfaceC2833avK2, strX, ds);
    }

    @Override // defpackage.InterfaceC5122lc0
    public boolean a(@NotNull T data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "data");
        return true;
    }

    @Override // defpackage.InterfaceC5122lc0
    @Nullable
    public final Object c(@NotNull C2509Yn1 c2509Yn1, @NotNull Object obj, @NotNull LM1 lm1, @NotNull C4695ja1 c4695ja1, @NotNull S60 s60) {
        return d(this, obj, c4695ja1, s60);
    }

    @NotNull
    public abstract C1318Jr0 e(@NotNull T t);
}

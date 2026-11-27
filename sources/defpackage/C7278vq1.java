package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7278vq1 extends C6648sq1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull LM lm) {
        C6858tq1 c6858tq1;
        String password;
        String str;
        String login;
        String lang;
        String referId;
        if (lm instanceof C6858tq1) {
            c6858tq1 = (C6858tq1) lm;
            int i = c6858tq1.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6858tq1.l = i - Integer.MIN_VALUE;
            } else {
                c6858tq1 = new C6858tq1(this, lm);
            }
        } else {
            c6858tq1 = new C6858tq1(this, lm);
        }
        Object obj = c6858tq1.j;
        MN mn = MN.d;
        int i2 = c6858tq1.l;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C5176lq1 c5176lq1 = this.a;
            String str2 = c5176lq1.a;
            password = c5176lq1.b;
            String strJ = C1952Ru.j();
            FF ff = (FF) this.b.b.getValue();
            String strValueOf = String.valueOf(ff != null ? ff.e : null);
            String str3 = c5176lq1.e;
            c6858tq1.d = str2;
            c6858tq1.e = password;
            c6858tq1.g = strJ;
            c6858tq1.h = strValueOf;
            c6858tq1.i = str3;
            c6858tq1.l = 1;
            Object objA = this.c.a(c6858tq1);
            if (objA == mn) {
                return mn;
            }
            str = str3;
            obj = objA;
            login = str2;
            lang = strJ;
            referId = strValueOf;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c6858tq1.i;
            referId = c6858tq1.h;
            lang = c6858tq1.g;
            password = c6858tq1.e;
            login = c6858tq1.d;
            C1795Pt1.b(obj);
        }
        String subId = (String) obj;
        Intrinsics.checkNotNullParameter(login, "login");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter("web", "clientType");
        Intrinsics.checkNotNullParameter(referId, "referId");
        Intrinsics.checkNotNullParameter(subId, "subId");
        C5476nG c5476nG = new C5476nG();
        c5476nG.a = login;
        c5476nG.b = password;
        c5476nG.c = lang;
        c5476nG.d = referId;
        c5476nG.e = subId;
        c5476nG.f = str;
        return c5476nG;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull LM lm) {
        C7068uq1 c7068uq1;
        InterfaceC7012ub2 interfaceC7012ub2;
        C7278vq1 c7278vq1;
        C7278vq1 c7278vq2;
        CommonResult commonResult;
        C6120qK1 c6120qK1;
        C4612j90.b bVar;
        C7278vq1 c7278vq3;
        CommonResult commonResult2;
        String str;
        Object objX;
        if (lm instanceof C7068uq1) {
            c7068uq1 = (C7068uq1) lm;
            int i = c7068uq1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7068uq1.i = i - Integer.MIN_VALUE;
            } else {
                c7068uq1 = new C7068uq1(this, lm);
            }
        } else {
            c7068uq1 = new C7068uq1(this, lm);
        }
        Object objA = c7068uq1.g;
        MN mn = MN.d;
        int i2 = c7068uq1.i;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            c7068uq1.d = this;
            interfaceC7012ub2 = this.e;
            c7068uq1.e = interfaceC7012ub2;
            c7068uq1.i = 1;
            objA = a(c7068uq1);
            if (objA != mn) {
                c7278vq1 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            interfaceC7012ub2 = (InterfaceC7012ub2) c7068uq1.e;
            c7278vq1 = (C7278vq1) c7068uq1.d;
            C1795Pt1.b(objA);
        } else {
            if (i2 == 2) {
                c7278vq2 = (C7278vq1) c7068uq1.d;
                C1795Pt1.b(objA);
                commonResult = (CommonResult) objA;
                if (commonResult instanceof ResultOk) {
                    return commonResult;
                }
                C5176lq1 c5176lq1 = c7278vq2.a;
                String str2 = ((C6315rG) ((ResultOk) commonResult).a()).a;
                c5176lq1.getClass();
                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                c5176lq1.c = str2;
                c6120qK1 = c7278vq2.d.z;
                bVar = C4612j90.b.d;
                c7068uq1.d = c7278vq2;
                c7068uq1.e = commonResult;
                c7068uq1.i = 3;
                if (c6120qK1.a(bVar, c7068uq1) != mn) {
                    c7278vq3 = c7278vq2;
                    commonResult2 = commonResult;
                }
                return mn;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CommonResult commonResult3 = (CommonResult) c7068uq1.d;
                C1795Pt1.b(objA);
                return commonResult3;
            }
            commonResult2 = (CommonResult) c7068uq1.e;
            c7278vq3 = (C7278vq1) c7068uq1.d;
            C1795Pt1.b(objA);
        }
        str = ((C6315rG) ((ResultOk) commonResult2).a()).a;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            c7068uq1.d = commonResult2;
            c7068uq1.e = null;
            c7068uq1.i = 4;
            c7278vq3.getClass();
            objX = c7278vq3.e.x(new C6735tG(str, 2), c7068uq1);
            if (objX != mn) {
                objX = Unit.a;
            }
            if (objX == mn) {
                return mn;
            }
        }
        return commonResult2;
        c7068uq1.d = c7278vq1;
        c7068uq1.e = null;
        c7068uq1.i = 2;
        objA = interfaceC7012ub2.f((C5476nG) objA, c7068uq1);
        if (objA != mn) {
            c7278vq2 = c7278vq1;
            commonResult = (CommonResult) objA;
            if (commonResult instanceof ResultOk) {
                return commonResult;
            }
            C5176lq1 c5176lq2 = c7278vq2.a;
            String str3 = ((C6315rG) ((ResultOk) commonResult).a()).a;
            c5176lq2.getClass();
            Intrinsics.checkNotNullParameter(str3, "<set-?>");
            c5176lq2.c = str3;
            c6120qK1 = c7278vq2.d.z;
            bVar = C4612j90.b.d;
            c7068uq1.d = c7278vq2;
            c7068uq1.e = commonResult;
            c7068uq1.i = 3;
            if (c6120qK1.a(bVar, c7068uq1) != mn) {
                c7278vq3 = c7278vq2;
                commonResult2 = commonResult;
                str = ((C6315rG) ((ResultOk) commonResult2).a()).a;
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    c7068uq1.d = commonResult2;
                    c7068uq1.e = null;
                    c7068uq1.i = 4;
                    c7278vq3.getClass();
                    objX = c7278vq3.e.x(new C6735tG(str, 2), c7068uq1);
                    if (objX != mn) {
                        objX = Unit.a;
                    }
                    if (objX == mn) {
                    }
                }
                return commonResult2;
            }
        }
        return mn;
    }
}

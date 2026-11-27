package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0749Cj1 extends AbstractC3401dd2 implements InterfaceC0671Bj1 {
    public C0983Fj1 A;
    public C1687Oj1 B;
    public C6384rc0 C;
    public C6384rc0 D;
    public final C01 m;
    public AbstractC5533nZ n;
    public Collection<? extends InterfaceC0671Bj1> o;
    public final InterfaceC0671Bj1 p;
    public final InterfaceC1490Lx.a q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public List<InterfaceC1076Go1> w;
    public InterfaceC1076Go1 x;
    public C1154Ho1 y;
    public ArrayList z;

    /* JADX INFO: renamed from: Cj1$a */
    public class a {
        public InterfaceC4675jU a;
        public C01 b;
        public AbstractC5533nZ c;
        public InterfaceC1490Lx.a e;
        public final InterfaceC1076Go1 h;
        public final C5638o21 i;
        public final AbstractC4649jL0 j;
        public InterfaceC0671Bj1 d = null;
        public T62 f = T62.a;
        public boolean g = true;

        public a() {
            this.a = C0749Cj1.this.e();
            this.b = C0749Cj1.this.q();
            this.c = C0749Cj1.this.d();
            this.e = C0749Cj1.this.h();
            this.h = C0749Cj1.this.x;
            this.i = C0749Cj1.this.getName();
            this.j = C0749Cj1.this.getType();
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 19 || i == 13 || i == 14 || i == 16 || i == 17) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i == 1) {
                objArr[1] = "setOwner";
            } else if (i == 2) {
                objArr[1] = "setOriginal";
            } else if (i == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i == 5) {
                objArr[1] = "setReturnType";
            } else if (i == 7) {
                objArr[1] = "setModality";
            } else if (i == 9) {
                objArr[1] = "setVisibility";
            } else if (i == 11) {
                objArr[1] = "setKind";
            } else if (i == 19) {
                objArr[1] = "setName";
            } else if (i == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i == 16) {
                objArr[1] = "setSubstitution";
            } else if (i != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 5 && i != 7 && i != 9 && i != 11 && i != 19 && i != 13 && i != 14 && i != 16 && i != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5, types: [Oj1, Tj0, vj1] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1, types: [Ej1] */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v3 */
        /* JADX WARN: Type inference failed for: r16v4, types: [Nj1] */
        /* JADX WARN: Type inference failed for: r16v5 */
        /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v15, types: [Fj1, vj1] */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r4v14, types: [rc0] */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r5v14, types: [rc0] */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v19, types: [Tj0] */
        /* JADX WARN: Type inference failed for: r5v28 */
        /* JADX WARN: Type inference failed for: r5v29, types: [Tj0] */
        /* JADX WARN: Type inference failed for: r5v30 */
        /* JADX WARN: Type inference failed for: r5v31, types: [jL0] */
        /* JADX WARN: Type inference failed for: r5v39 */
        /* JADX WARN: Type inference failed for: r5v40 */
        /* JADX WARN: Type inference failed for: r5v41 */
        /* JADX WARN: Type inference failed for: r5v42 */
        /* JADX WARN: Type inference failed for: r8v0, types: [Bj1, Cj1, Jx, dd2, jU] */
        @Nullable
        public final C0749Cj1 b() {
            X0 x0;
            C1154Ho1 c1154Ho1;
            ?? c0983Fj1;
            ?? c1687Oj1;
            X62 x62;
            Function0<InterfaceC5868p71<CK<?>>> function0;
            C1154Ho1 c1154Ho2;
            C1154Ho1 c1154Ho3;
            C0749Cj1 c0749Cj1 = C0749Cj1.this;
            c0749Cj1.getClass();
            InterfaceC4675jU interfaceC4675jU = this.a;
            C01 c01 = this.b;
            AbstractC5533nZ abstractC5533nZ = this.c;
            InterfaceC0671Bj1 interfaceC0671Bj1 = this.d;
            InterfaceC1490Lx.a aVar = this.e;
            VN1.a aVar2 = VN1.a;
            ?? X0 = c0749Cj1.X0(interfaceC4675jU, c01, abstractC5533nZ, interfaceC0671Bj1, aVar, this.i);
            List<H62> listW = c0749Cj1.w();
            ArrayList arrayList = new ArrayList(((ArrayList) listW).size());
            X62 x62R = C5208m0.r(listW, this.f, X0, arrayList);
            EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.OUT_VARIANCE;
            AbstractC4649jL0 abstractC4649jL0 = this.j;
            AbstractC4649jL0 abstractC4649jL0J = x62R.j(abstractC4649jL0, enumC3610ed2);
            C1154Ho1 c1154Ho4 = null;
            if (abstractC4649jL0J != null) {
                EnumC3610ed2 enumC3610ed3 = EnumC3610ed2.IN_VARIANCE;
                AbstractC4649jL0 abstractC4649jL0J2 = x62R.j(abstractC4649jL0, enumC3610ed3);
                if (abstractC4649jL0J2 != null) {
                    X0.Z0(abstractC4649jL0J2);
                }
                InterfaceC1076Go1 interfaceC1076Go1 = this.h;
                if (interfaceC1076Go1 != null) {
                    X0 x0B = interfaceC1076Go1.b(x62R);
                    x0 = x0B != null ? x0B : null;
                }
                C1154Ho1 c1154Ho5 = c0749Cj1.y;
                if (c1154Ho5 != null) {
                    AbstractC4649jL0 abstractC4649jL0J3 = x62R.j(c1154Ho5.getType(), enumC3610ed3);
                    c1154Ho1 = abstractC4649jL0J3 == null ? null : new C1154Ho1(X0, new C1189Ia0(X0, abstractC4649jL0J3, c1154Ho5.getValue()), c1154Ho5.k());
                } else {
                    c1154Ho1 = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1076Go1 interfaceC1076Go2 : c0749Cj1.w) {
                    AbstractC4649jL0 abstractC4649jL0J4 = x62R.j(interfaceC1076Go2.getType(), EnumC3610ed2.IN_VARIANCE);
                    if (abstractC4649jL0J4 == null) {
                        c1154Ho2 = c1154Ho4;
                        c1154Ho3 = c1154Ho2;
                    } else {
                        c1154Ho3 = c1154Ho4;
                        c1154Ho2 = new C1154Ho1(X0, new DM(X0, abstractC4649jL0J4, ((InterfaceC1488Lw0) interfaceC1076Go2.getValue()).a(), interfaceC1076Go2.getValue()), interfaceC1076Go2.k());
                    }
                    if (c1154Ho2 != null) {
                        arrayList2.add(c1154Ho2);
                    }
                    c1154Ho4 = c1154Ho3;
                }
                ?? r18 = c1154Ho4;
                X0.a1(abstractC4649jL0J, arrayList, x0, c1154Ho1, arrayList2);
                C0983Fj1 c0983Fj2 = c0749Cj1.A;
                InterfaceC1490Lx.a aVar3 = InterfaceC1490Lx.a.e;
                if (c0983Fj2 == null) {
                    c0983Fj1 = r18;
                } else {
                    InterfaceC2396Xc interfaceC2396XcK = c0983Fj2.k();
                    C01 c02 = this.b;
                    AbstractC5533nZ abstractC5533nZD = c0749Cj1.A.d();
                    if (this.e == aVar3 && C5323mZ.e(abstractC5533nZD.d())) {
                        abstractC5533nZD = C5323mZ.h;
                    }
                    AbstractC5533nZ abstractC5533nZ2 = abstractC5533nZD;
                    C0983Fj1 c0983Fj3 = c0749Cj1.A;
                    boolean z = c0983Fj3.i;
                    InterfaceC1490Lx.a aVar4 = this.e;
                    InterfaceC0671Bj1 interfaceC0671Bj2 = this.d;
                    c0983Fj1 = new C0983Fj1(X0, interfaceC2396XcK, c02, abstractC5533nZ2, z, c0983Fj3.j, c0983Fj3.m, aVar4, interfaceC0671Bj2 == null ? r18 : interfaceC0671Bj2.f(), aVar2);
                }
                if (c0983Fj1 != 0) {
                    C0983Fj1 c0983Fj4 = c0749Cj1.A;
                    AbstractC4649jL0 abstractC4649jL1 = c0983Fj4.q;
                    c0983Fj1.p = c0983Fj4.l0() != null ? c0983Fj4.l0().b(x62R) : r18;
                    c0983Fj1.X0(abstractC4649jL1 != null ? x62R.j(abstractC4649jL1, EnumC3610ed2.OUT_VARIANCE) : r18);
                }
                C1687Oj1 c1687Oj2 = c0749Cj1.B;
                if (c1687Oj2 == null) {
                    c1687Oj1 = r18;
                } else {
                    InterfaceC2396Xc interfaceC2396XcK2 = c1687Oj2.k();
                    C01 c03 = this.b;
                    AbstractC5533nZ abstractC5533nZD2 = c0749Cj1.B.d();
                    if (this.e == aVar3 && C5323mZ.e(abstractC5533nZD2.d())) {
                        abstractC5533nZD2 = C5323mZ.h;
                    }
                    AbstractC5533nZ abstractC5533nZ3 = abstractC5533nZD2;
                    C1687Oj1 c1687Oj3 = c0749Cj1.B;
                    boolean z2 = c1687Oj3.i;
                    boolean z3 = c1687Oj3.j;
                    boolean z4 = c1687Oj3.m;
                    InterfaceC1490Lx.a aVar5 = this.e;
                    InterfaceC0671Bj1 interfaceC0671Bj3 = this.d;
                    c1687Oj1 = new C1687Oj1(X0, interfaceC2396XcK2, c03, abstractC5533nZ3, z2, z3, z4, aVar5, interfaceC0671Bj3 == null ? r18 : interfaceC0671Bj3.g(), aVar2);
                }
                if (c1687Oj1 != 0) {
                    x62 = x62R;
                    List listX0 = AbstractC2314Wj0.X0(c1687Oj1, c0749Cj1.B.j(), x62, false, false, null);
                    if (listX0 == null) {
                        listX0 = Collections.singletonList(C1687Oj1.W0(c1687Oj1, C4900kZ.e(this.a).n(), c0749Cj1.B.j().get(0).k()));
                    }
                    if (listX0.size() != 1) {
                        throw new IllegalStateException();
                    }
                    C1687Oj1 c1687Oj4 = c0749Cj1.B;
                    if (c1687Oj4 == null) {
                        C0749Cj1.G0(31);
                        throw r18;
                    }
                    c1687Oj1.p = c1687Oj4.l0() != null ? c1687Oj4.l0().b(x62) : r18;
                    Xc2 xc2 = (Xc2) listX0.get(0);
                    if (xc2 == null) {
                        C1687Oj1.G0(6);
                        throw r18;
                    }
                    c1687Oj1.q = xc2;
                } else {
                    x62 = x62R;
                }
                C6384rc0 c6384rc0 = c0749Cj1.C;
                ?? c6384rc1 = c6384rc0 == null ? r18 : new C6384rc0(c6384rc0.k(), X0);
                C6384rc0 c6384rc2 = c0749Cj1.D;
                X0.Y0(c0983Fj1, c1687Oj1, c6384rc1, c6384rc2 == null ? r18 : new C6384rc0(c6384rc2.k(), X0));
                if (this.g) {
                    C3768fN1 c3768fN1 = new C3768fN1();
                    Iterator<? extends InterfaceC0671Bj1> it = c0749Cj1.u().iterator();
                    while (it.hasNext()) {
                        c3768fN1.add(it.next().b(x62));
                    }
                    X0.o = c3768fN1;
                }
                if (c0749Cj1.F() && (function0 = c0749Cj1.l) != null) {
                    X0.U0(c0749Cj1.k, function0);
                }
                return X0;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749Cj1(@NotNull InterfaceC4675jU interfaceC4675jU, @Nullable InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, boolean z, @NotNull C5638o21 c5638o21, @NotNull InterfaceC1490Lx.a aVar, @NotNull VN1 vn1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(interfaceC4675jU, interfaceC2396Xc, c5638o21, z, vn1);
        if (interfaceC4675jU == null) {
            G0(0);
            throw null;
        }
        if (interfaceC2396Xc == null) {
            G0(1);
            throw null;
        }
        if (c01 == null) {
            G0(2);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(3);
            throw null;
        }
        if (c5638o21 == null) {
            G0(4);
            throw null;
        }
        if (aVar == null) {
            G0(5);
            throw null;
        }
        if (vn1 == null) {
            G0(6);
            throw null;
        }
        this.o = null;
        this.w = Collections.EMPTY_LIST;
        this.m = c01;
        this.n = abstractC5533nZ;
        this.p = interfaceC0671Bj1 == null ? this : interfaceC0671Bj1;
        this.q = aVar;
        this.r = z2;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = z6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void G0(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = Payload.SOURCE;
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    objArr[1] = "getReturnType";
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case RequestError.NO_DEV_KEY /* 41 */:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case UserVerificationMethods.USER_VERIFY_LOCATION /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case RequestError.NETWORK_FAILURE /* 40 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static C0749Cj1 W0(@NotNull FC fc, @NotNull C01 c01, @NotNull C5323mZ.h hVar, boolean z, @NotNull C5638o21 c5638o21, @NotNull InterfaceC1490Lx.a aVar, @NotNull VN1 vn1) {
        InterfaceC2396Xc.a.C0193a c0193a = InterfaceC2396Xc.a.a;
        if (fc == null) {
            G0(7);
            throw null;
        }
        if (hVar == null) {
            G0(10);
            throw null;
        }
        if (c5638o21 == null) {
            G0(11);
            throw null;
        }
        if (vn1 != null) {
            return new C0749Cj1(fc, null, c0193a, c01, hVar, z, c5638o21, aVar, vn1, false, false, false, false, false);
        }
        G0(13);
        throw null;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @NotNull
    public final ArrayList B() {
        ArrayList arrayList = new ArrayList(2);
        C0983Fj1 c0983Fj1 = this.A;
        if (c0983Fj1 != null) {
            arrayList.add(c0983Fj1);
        }
        C1687Oj1 c1687Oj1 = this.B;
        if (c1687Oj1 != null) {
            arrayList.add(c1687Oj1);
        }
        return arrayList;
    }

    @Override // defpackage.GY0
    public boolean D() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1490Lx
    public final void D0(@NotNull Collection<? extends InterfaceC1490Lx> collection) {
        if (collection != 0) {
            this.o = collection;
        } else {
            G0(40);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2982bd2
    public boolean F() {
        return this.s;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return this.t;
    }

    @Override // defpackage.InterfaceC1335Jx
    @Nullable
    public <V> V T(InterfaceC1335Jx.a<V> aVar) {
        throw null;
    }

    @Override // defpackage.InterfaceC0671Bj1
    public final boolean U() {
        return this.v;
    }

    @Override // defpackage.InterfaceC1490Lx
    @NotNull
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final C0749Cj1 C(FC fc, C01 c01, QW qw) {
        InterfaceC1490Lx.a aVar = InterfaceC1490Lx.a.e;
        a aVar2 = new a();
        if (fc == null) {
            a.a(0);
            throw null;
        }
        aVar2.a = fc;
        aVar2.d = null;
        aVar2.b = c01;
        if (qw == null) {
            a.a(8);
            throw null;
        }
        aVar2.c = qw;
        aVar2.e = aVar;
        aVar2.g = false;
        C0749Cj1 c0749Cj1B = aVar2.b();
        if (c0749Cj1B != null) {
            return c0749Cj1B;
        }
        G0(42);
        throw null;
    }

    @NotNull
    public C0749Cj1 X0(@NotNull InterfaceC4675jU interfaceC4675jU, @NotNull C01 c01, @NotNull AbstractC5533nZ abstractC5533nZ, @Nullable InterfaceC0671Bj1 interfaceC0671Bj1, @NotNull InterfaceC1490Lx.a aVar, @NotNull C5638o21 c5638o21) {
        VN1.a aVar2 = VN1.a;
        if (interfaceC4675jU == null) {
            G0(32);
            throw null;
        }
        if (c01 == null) {
            G0(33);
            throw null;
        }
        if (abstractC5533nZ == null) {
            G0(34);
            throw null;
        }
        if (aVar == null) {
            G0(35);
            throw null;
        }
        if (c5638o21 == null) {
            G0(36);
            throw null;
        }
        InterfaceC2396Xc interfaceC2396XcK = k();
        boolean zF = F();
        boolean zD = D();
        return new C0749Cj1(interfaceC4675jU, interfaceC0671Bj1, interfaceC2396XcK, c01, abstractC5533nZ, this.j, c5638o21, aVar, aVar2, this.r, zF, this.t, zD, this.v);
    }

    public final void Y0(@Nullable C0983Fj1 c0983Fj1, @Nullable C1687Oj1 c1687Oj1, @Nullable C6384rc0 c6384rc0, @Nullable C6384rc0 c6384rc1) {
        this.A = c0983Fj1;
        this.B = c1687Oj1;
        this.C = c6384rc0;
        this.D = c6384rc1;
    }

    public final void a1(@NotNull AbstractC4649jL0 abstractC4649jL0, @NotNull List list, @Nullable InterfaceC1076Go1 interfaceC1076Go1, @Nullable C1154Ho1 c1154Ho1, @NotNull List list2) {
        if (abstractC4649jL0 == null) {
            G0(17);
            throw null;
        }
        if (list == null) {
            G0(18);
            throw null;
        }
        if (list2 == null) {
            G0(19);
            throw null;
        }
        this.i = abstractC4649jL0;
        this.z = new ArrayList(list);
        this.y = c1154Ho1;
        this.x = interfaceC1076Go1;
        this.w = list2;
    }

    @Override // defpackage.InterfaceC5938pU, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        AbstractC5533nZ abstractC5533nZ = this.n;
        if (abstractC5533nZ != null) {
            return abstractC5533nZ;
        }
        G0(25);
        throw null;
    }

    @Override // defpackage.InterfaceC4675jU
    public final <R, D> R e0(InterfaceC5518nU<R, D> interfaceC5518nU, D d) {
        return (R) interfaceC5518nU.c(this, d);
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final C0983Fj1 f() {
        return this.A;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final InterfaceC1609Nj1 g() {
        return this.B;
    }

    @Override // defpackage.InterfaceC1490Lx
    @NotNull
    public final InterfaceC1490Lx.a h() {
        InterfaceC1490Lx.a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        G0(39);
        throw null;
    }

    @Override // defpackage.AbstractC3191cd2, defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 m0() {
        return this.x;
    }

    @Override // defpackage.AbstractC3191cd2, defpackage.InterfaceC1335Jx
    @NotNull
    public final AbstractC4649jL0 n() {
        AbstractC4649jL0 type = getType();
        if (type != null) {
            return type;
        }
        G0(23);
        throw null;
    }

    @Override // defpackage.GY0
    @NotNull
    public final C01 q() {
        C01 c01 = this.m;
        if (c01 != null) {
            return c01;
        }
        G0(24);
        throw null;
    }

    @Override // defpackage.AbstractC3191cd2, defpackage.InterfaceC1335Jx
    @Nullable
    public final InterfaceC1076Go1 r0() {
        return this.y;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final C6384rc0 s0() {
        return this.D;
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final Collection<? extends InterfaceC0671Bj1> u() {
        Collection<? extends InterfaceC0671Bj1> collection = this.o;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        G0(41);
        throw null;
    }

    @Override // defpackage.InterfaceC0671Bj1
    @Nullable
    public final C6384rc0 v0() {
        return this.C;
    }

    @Override // defpackage.AbstractC3191cd2, defpackage.InterfaceC1335Jx
    @NotNull
    public final List<H62> w() {
        ArrayList arrayList = this.z;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // defpackage.InterfaceC1335Jx
    @NotNull
    public final List<InterfaceC1076Go1> w0() {
        List<InterfaceC1076Go1> list = this.w;
        if (list != null) {
            return list;
        }
        G0(22);
        throw null;
    }

    @Override // defpackage.InterfaceC2982bd2
    public final boolean x0() {
        return this.r;
    }

    @Override // defpackage.IU1
    public final InterfaceC0671Bj1 b(@NotNull X62 x62) {
        if (x62 == null) {
            G0(27);
            throw null;
        }
        if (x62.a.f()) {
            return this;
        }
        a aVar = new a();
        T62 t62G = x62.g();
        if (t62G == null) {
            a.a(15);
            throw null;
        }
        aVar.f = t62G;
        aVar.d = U0();
        return aVar.b();
    }

    @Override // defpackage.AbstractC5308mU, defpackage.AbstractC4885kU, defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0671Bj1 U0() {
        InterfaceC0671Bj1 interfaceC0671Bj1 = this.p;
        InterfaceC0671Bj1 interfaceC0671Bj1U0 = interfaceC0671Bj1 == this ? this : interfaceC0671Bj1.U0();
        if (interfaceC0671Bj1U0 != null) {
            return interfaceC0671Bj1U0;
        }
        G0(38);
        throw null;
    }

    public void Z0(@NotNull AbstractC4649jL0 abstractC4649jL0) {
    }
}

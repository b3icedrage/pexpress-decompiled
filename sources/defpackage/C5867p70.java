package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: p70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5867p70 extends GC {
    public final ZC k;
    public final a l;
    public final I51<Set<C5638o21>> m;
    public final InterfaceC2396Xc n;

    /* JADX INFO: renamed from: p70$a */
    public class a extends RY0 {
        public final UY0<C5638o21, Collection<? extends InterfaceC3765fM1>> b;
        public final UY0<C5638o21, Collection<? extends InterfaceC0671Bj1>> c;
        public final I51<Collection<InterfaceC4675jU>> d;
        public final /* synthetic */ C5867p70 e;

        public a(@NotNull C5867p70 c5867p70, C2720aS0 c2720aS0) {
            if (c2720aS0 == null) {
                h(0);
                throw null;
            }
            this.e = c5867p70;
            this.b = c2720aS0.e(new C5024l70(this));
            this.c = c2720aS0.e(new C5237m70(this));
            this.d = new C2720aS0.h(c2720aS0, new C5447n70(this));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        public static /* synthetic */ void h(int i) {
            String str;
            int i2;
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    case 19:
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
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 15:
                case 16:
                case 17:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = R51.PUSH_MINIFIED_BUTTON_ICON;
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 15:
                case 16:
                case 17:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Set<C5638o21> a() {
            Set<C5638o21> setInvoke = this.e.m.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(17);
            throw null;
        }

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Collection b(@NotNull C5638o21 c5638o21, @NotNull S41 s41) {
            if (c5638o21 != null) {
                return (Collection) ((C2720aS0.k) this.c).invoke(c5638o21);
            }
            h(1);
            throw null;
        }

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Set<C5638o21> c() {
            Set<C5638o21> setInvoke = this.e.m.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(19);
            throw null;
        }

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Collection<? extends InterfaceC3765fM1> d(@NotNull C5638o21 c5638o21, @NotNull JT0 jt0) {
            if (c5638o21 != null) {
                return (Collection) ((C2720aS0.k) this.b).invoke(c5638o21);
            }
            h(5);
            throw null;
        }

        @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
        @NotNull
        public final Collection<InterfaceC4675jU> e(@NotNull LY ly, @NotNull Function1<? super C5638o21, Boolean> function1) {
            if (ly == null) {
                h(13);
                throw null;
            }
            Collection<InterfaceC4675jU> collectionInvoke = this.d.invoke();
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            h(15);
            throw null;
        }

        @Override // defpackage.RY0, defpackage.QY0
        @NotNull
        public final Set<C5638o21> g() {
            Set<C5638o21> set = Collections.EMPTY_SET;
            if (set != null) {
                return set;
            }
            h(18);
            throw null;
        }

        @NotNull
        public final QY0 i() {
            QY0 qy0V = ((B1) this.e.p()).a().iterator().next().v();
            if (qy0V != null) {
                return qy0V;
            }
            h(9);
            throw null;
        }

        @NotNull
        public final LinkedHashSet j(@NotNull C5638o21 c5638o21, @NotNull Collection collection) {
            if (c5638o21 == null) {
                h(10);
                throw null;
            }
            if (collection == null) {
                h(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C1346Ka1.e.h(c5638o21, collection, Collections.EMPTY_SET, this.e, new C5657o70(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5867p70(@NotNull C2720aS0 c2720aS0, @NotNull FC fc, @NotNull AbstractC5706oM1 abstractC5706oM1, @NotNull C5638o21 c5638o21, @NotNull I51 i51, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull VN1 vn1) {
        super(c2720aS0, fc, c5638o21, vn1);
        if (c2720aS0 == null) {
            H0(6);
            throw null;
        }
        if (fc == null) {
            H0(7);
            throw null;
        }
        if (abstractC5706oM1 == null) {
            H0(8);
            throw null;
        }
        if (c5638o21 == null) {
            H0(9);
            throw null;
        }
        if (i51 == null) {
            H0(10);
            throw null;
        }
        if (vn1 == null) {
            H0(12);
            throw null;
        }
        this.n = interfaceC2396Xc;
        this.k = new ZC(this, Collections.EMPTY_LIST, Collections.singleton(abstractC5706oM1), c2720aS0);
        this.l = new a(this, c2720aS0);
        this.m = i51;
    }

    public static /* synthetic */ void H0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = Payload.SOURCE;
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @NotNull
    public static C5867p70 T0(@NotNull C2720aS0 c2720aS0, @NotNull FC fc, @NotNull C5638o21 c5638o21, @NotNull I51 i51, @NotNull InterfaceC2396Xc interfaceC2396Xc, @NotNull VN1 vn1) {
        if (c2720aS0 == null) {
            H0(0);
            throw null;
        }
        if (fc == null) {
            H0(1);
            throw null;
        }
        if (c5638o21 == null) {
            H0(2);
            throw null;
        }
        if (i51 == null) {
            H0(3);
            throw null;
        }
        if (vn1 != null) {
            return new C5867p70(c2720aS0, fc, fc.y(), c5638o21, i51, interfaceC2396Xc, vn1);
        }
        H0(5);
        throw null;
    }

    @Override // defpackage.FC, defpackage.InterfaceC5257mD
    @NotNull
    public final List<H62> A() {
        List<H62> list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        H0(22);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean E() {
        return false;
    }

    @Override // defpackage.FC
    @Nullable
    public final Rc2<AbstractC5706oM1> F0() {
        return null;
    }

    @Override // defpackage.O01
    @NotNull
    public final QY0 G0(@NotNull AbstractC6331rL0 abstractC6331rL0) {
        if (abstractC6331rL0 == null) {
            H0(13);
            throw null;
        }
        a aVar = this.l;
        if (aVar != null) {
            return aVar;
        }
        H0(14);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean I() {
        return false;
    }

    @Override // defpackage.GY0
    public final boolean M0() {
        return false;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<FC> P() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        H0(23);
        throw null;
    }

    @Override // defpackage.GY0
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.FC
    public final boolean Q0() {
        return false;
    }

    @Override // defpackage.InterfaceC5257mD
    public final boolean R() {
        return false;
    }

    @Override // defpackage.FC
    @Nullable
    public final InterfaceC7984zC X() {
        return null;
    }

    @Override // defpackage.FC
    @NotNull
    public final QY0 Y() {
        QY0.b bVar = QY0.b.b;
        if (bVar != null) {
            return bVar;
        }
        H0(15);
        throw null;
    }

    @Override // defpackage.FC
    @Nullable
    public final FC a0() {
        return null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final AbstractC5533nZ d() {
        C5323mZ.h hVar = C5323mZ.e;
        if (hVar != null) {
            return hVar;
        }
        H0(20);
        throw null;
    }

    @Override // defpackage.FC
    @NotNull
    public final SC h() {
        return SC.h;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        InterfaceC2396Xc interfaceC2396Xc = this.n;
        if (interfaceC2396Xc != null) {
            return interfaceC2396Xc;
        }
        H0(21);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean m() {
        return false;
    }

    @Override // defpackage.InterfaceC5044lD
    @NotNull
    public final InterfaceC6494s62 p() {
        ZC zc = this.k;
        if (zc != null) {
            return zc;
        }
        H0(17);
        throw null;
    }

    @Override // defpackage.FC, defpackage.GY0
    @NotNull
    public final C01 q() {
        return C01.e;
    }

    @Override // defpackage.FC
    @NotNull
    public final Collection<InterfaceC7984zC> r() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        H0(16);
        throw null;
    }

    @Override // defpackage.FC
    public final boolean s() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.api.core.BaseFragment;
import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;
import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import com.pexpress.tool.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.services.NetworkManager$initOnNetworkStateChangeBehaviour$1", f = "NetworkManager.kt", l = {145}, m = "invokeSuspend")
public final class C7952z31 extends AW1 implements InterfaceC1294Jj0<C0667Bi0, Boolean, Boolean, Boolean, Boolean, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ C0667Bi0 e;
    public /* synthetic */ boolean g;
    public /* synthetic */ boolean h;
    public /* synthetic */ boolean i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ C6062q31 k;
    public final /* synthetic */ InterfaceC8042zV0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7952z31(C6062q31 c6062q31, InterfaceC8042zV0 interfaceC8042zV0, JM<? super C7952z31> jm) {
        super(6, jm);
        this.k = c6062q31;
        this.l = interfaceC8042zV0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0667Bi0 c0667Bi0;
        boolean z;
        boolean z2;
        boolean z3;
        Object objE;
        boolean z4;
        int i;
        ?? r2;
        boolean z5;
        int i2 = 0;
        boolean z6 = true;
        MN mn = MN.d;
        int i3 = this.d;
        C6062q31 c6062q31 = this.k;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            c0667Bi0 = this.e;
            z = this.g;
            z2 = this.h;
            z3 = this.i;
            boolean z7 = this.j;
            this.e = c0667Bi0;
            this.g = z;
            this.h = z2;
            this.i = z3;
            this.j = z7;
            this.d = 1;
            c6062q31.getClass();
            BaseFragment baseFragment = c0667Bi0.d;
            InterfaceC8042zV0 interfaceC8042zV0 = this.l;
            if (z) {
                objE = c6062q31.e(interfaceC8042zV0, this);
                if (objE != mn) {
                    objE = Unit.a;
                }
            } else if ((baseFragment instanceof PlatformFragmentImpl) || z2) {
                RV rv = C6266r20.a;
                Object objP = C5189lv.p(QV0.a, new H31(c6062q31, interfaceC8042zV0, null), this);
                if (objP != mn) {
                    objP = Unit.a;
                }
                objE = objP;
                if (objE != mn) {
                    objE = Unit.a;
                }
            } else {
                objE = c6062q31.e(interfaceC8042zV0, this);
                if (objE != mn) {
                    objE = Unit.a;
                }
            }
            if (objE == mn) {
                return mn;
            }
            z4 = z7;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = this.j;
            z3 = this.i;
            z2 = this.h;
            z = this.g;
            c0667Bi0 = this.e;
            C1795Pt1.b(obj);
        }
        boolean z8 = z || z2;
        c6062q31.getClass();
        if (!(c0667Bi0.d instanceof LaunchAppFragmentImpl)) {
            GP1 gp1 = c6062q31.j;
            if (z8 || z3 || z4) {
                i = 0;
                r2 = 1;
                z4 = z4;
            } else {
                Context context = c6062q31.g;
                Intrinsics.checkNotNullParameter(context, "activity");
                Intrinsics.checkNotNullParameter(context, "context");
                C4076gq.a aVar = new C4076gq.a();
                aVar.c = true;
                aVar.d = true;
                aVar.e = R.drawable.ic_network_error_small;
                C6634sm0 c6634sm0 = new C6634sm0(c6062q31, 5);
                aVar.b = context.getString(R.string.refresh_text);
                aVar.m = c6634sm0;
                aVar.g = R.color.primary;
                aVar.a = context.getString(R.string.possible_network_error_text);
                aVar.f = R.color.cookieNetworkMessageColor;
                aVar.d = false;
                aVar.c = false;
                aVar.h = R.layout.layout_banner_network_error;
                aVar.i = R.anim.slide_in_top;
                aVar.j = R.anim.slide_in_bottom;
                aVar.k = R.anim.slide_out_top;
                aVar.l = R.anim.slide_out_bottom;
                C4076gq c4076gq = new C4076gq(context, aVar);
                ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq = c4076gq.b;
                if (viewOnTouchListenerC3656eq != null) {
                    View decorView = ((Activity) context).getWindow().getDecorView();
                    Intrinsics.c(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) ((ViewGroup) decorView).findViewById(android.R.id.content);
                    if (viewOnTouchListenerC3656eq.getParent() == null) {
                        Intrinsics.checkNotNull(viewGroup);
                        Intrinsics.checkNotNull(viewOnTouchListenerC3656eq);
                        if (viewOnTouchListenerC3656eq.getParent() == null) {
                            int childCount = viewGroup.getChildCount() - 1;
                            int i4 = -1;
                            while (true) {
                                if (i4 >= childCount) {
                                    i = i2;
                                    z5 = z6 ? 1 : 0;
                                    z4 = z4;
                                    viewGroup.addView(viewOnTouchListenerC3656eq);
                                    break;
                                }
                                View childAt = viewGroup.getChildAt(childCount);
                                if (childAt instanceof ViewOnTouchListenerC3656eq) {
                                    ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq2 = (ViewOnTouchListenerC3656eq) childAt;
                                    if (!viewOnTouchListenerC3656eq2.A) {
                                        int i5 = i2;
                                        boolean z9 = z6;
                                        while (true) {
                                            if (i5 >= childCount) {
                                                i = i2;
                                                break;
                                            }
                                            View childAt2 = viewGroup.getChildAt(i5);
                                            if (childAt2 instanceof ViewOnTouchListenerC3656eq) {
                                                ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq3 = (ViewOnTouchListenerC3656eq) childAt2;
                                                if (!viewOnTouchListenerC3656eq3.A) {
                                                    viewOnTouchListenerC3656eq3.A = z9;
                                                    viewOnTouchListenerC3656eq3.z.removeCallbacksAndMessages(null);
                                                    InterfaceC4286hq interfaceC4286hq = viewOnTouchListenerC3656eq3.w;
                                                    if (interfaceC4286hq != null) {
                                                        Intrinsics.checkNotNull(interfaceC4286hq);
                                                        interfaceC4286hq.onDismiss();
                                                    }
                                                    viewOnTouchListenerC3656eq3.z.postDelayed(new RunnableC2818aq(viewOnTouchListenerC3656eq3, 0), 200L);
                                                    i = 0;
                                                    break;
                                                }
                                            }
                                            boolean z10 = z9 ? 1 : 0;
                                            i5 += z10 ? 1 : 0;
                                            z4 = z4;
                                            z9 = z10 ? 1 : 0;
                                            i2 = 0;
                                        }
                                        viewOnTouchListenerC3656eq2.c(new C3665et(viewOnTouchListenerC3656eq2.getDismissListener(), viewGroup, viewOnTouchListenerC3656eq));
                                        z5 = z9;
                                        break;
                                    }
                                }
                                childCount--;
                                z4 = z4;
                                z6 = z6 ? 1 : 0 ? 1 : 0;
                                i4 = -1;
                                i2 = i2;
                            }
                        } else {
                            i = 0;
                            z5 = true;
                            z4 = z4;
                        }
                    } else {
                        i = 0;
                        z5 = true;
                        z4 = z4;
                    }
                } else {
                    i = 0;
                    z5 = true;
                    z4 = z4;
                }
                c6062q31.i = c4076gq;
                Boolean bool = Boolean.TRUE;
                gp1.getClass();
                gp1.m(null, bool);
                r2 = z5;
            }
            if (z8 || z4) {
                Boolean bool2 = Boolean.FALSE;
                gp1.getClass();
                gp1.m(null, bool2);
                C4076gq c4076gq2 = c6062q31.i;
                if (c4076gq2 != null) {
                    Context context2 = c4076gq2.a;
                    Intrinsics.c(context2, "null cannot be cast to non-null type android.app.Activity");
                    View decorView2 = ((Activity) context2).getWindow().getDecorView();
                    Intrinsics.c(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup2 = (ViewGroup) decorView2;
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(android.R.id.content);
                    int childCount2 = viewGroup2.getChildCount();
                    for (int i6 = i; i6 < childCount2; i6 += r2) {
                        View childAt3 = viewGroup2.getChildAt(i6);
                        if (childAt3 instanceof ViewOnTouchListenerC3656eq) {
                            int i7 = ViewOnTouchListenerC3656eq.B;
                            ((ViewOnTouchListenerC3656eq) childAt3).c(null);
                            break;
                        }
                    }
                    Intrinsics.checkNotNull(viewGroup3);
                    int childCount3 = viewGroup3.getChildCount();
                    for (int i8 = i; i8 < childCount3; i8 += r2) {
                        View childAt4 = viewGroup3.getChildAt(i8);
                        if (childAt4 instanceof ViewOnTouchListenerC3656eq) {
                            int i9 = ViewOnTouchListenerC3656eq.B;
                            ((ViewOnTouchListenerC3656eq) childAt4).c(null);
                            break;
                        }
                    }
                }
                c6062q31.i = null;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1294Jj0
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj5).booleanValue();
        InterfaceC8042zV0 interfaceC8042zV0 = this.l;
        C7952z31 c7952z31 = new C7952z31(this.k, interfaceC8042zV0, (JM) serializable);
        c7952z31.e = (C0667Bi0) obj;
        c7952z31.g = zBooleanValue;
        c7952z31.h = zBooleanValue2;
        c7952z31.i = zBooleanValue3;
        c7952z31.j = zBooleanValue4;
        return c7952z31.invokeSuspend(Unit.a);
    }
}

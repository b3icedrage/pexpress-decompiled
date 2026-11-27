package defpackage;

import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "StopConfirmBottomSheetDialogFragment.kt", l = {48}, m = "invokeSuspend")
public final class AQ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ StopConfirmBottomSheetDialogFragment h;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetDialogFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "StopConfirmBottomSheetDialogFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ StopConfirmBottomSheetDialogFragment h;

        /* JADX INFO: renamed from: AQ1$a$a, reason: collision with other inner class name */
        public static final class C0001a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ StopConfirmBottomSheetDialogFragment e;

            public C0001a(KN kn, StopConfirmBottomSheetDialogFragment stopConfirmBottomSheetDialogFragment) {
                this.e = stopConfirmBottomSheetDialogFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                final StopConfirmBottomSheetDialogFragment stopConfirmBottomSheetDialogFragment = this.e;
                IQ1 iq1I = stopConfirmBottomSheetDialogFragment.i();
                ImageView titleImage = iq1I.i;
                Intrinsics.checkNotNullExpressionValue(titleImage, "titleImage");
                ((EQ1) obj).getClass();
                C3435dm0.e(titleImage, R.drawable.ic_information, EnumC7035uh1.g);
                iq1I.j.setText(R.string.stop_robot_dialog_tittle);
                C3452ds c3452ds = iq1I.h;
                c3452ds.e.setText(R.string.one_click_stop_text);
                c3452ds.g.setText(R.string.one_click_stop_description);
                iq1I.e.setOnClickListener(new XQ(stopConfirmBottomSheetDialogFragment, 3));
                iq1I.g.setOnClickListener(new ViewOnClickListenerC5007l3(stopConfirmBottomSheetDialogFragment, 5));
                c3452ds.d.setOnClickListener(new ViewOnClickListenerC6713t9(iq1I, 6));
                SwitchMaterial switchMaterial = c3452ds.h;
                switchMaterial.setChecked(false);
                switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yQ1
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        Object obj2 = stopConfirmBottomSheetDialogFragment.g;
                        Intrinsics.checkNotNull(obj2);
                        DQ1 dq1 = (DQ1) obj2;
                        dq1.getClass();
                        C6561sS.g(dq1, new BQ1(dq1, z, null));
                    }
                });
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, StopConfirmBottomSheetDialogFragment stopConfirmBottomSheetDialogFragment) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = stopConfirmBottomSheetDialogFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0001a c0001a = new C0001a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0001a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQ1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, StopConfirmBottomSheetDialogFragment stopConfirmBottomSheetDialogFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = stopConfirmBottomSheetDialogFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new AQ1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((AQ1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}

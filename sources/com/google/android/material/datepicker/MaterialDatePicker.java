package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.internal.CheckableImageButton;
import com.pexpress.tool.R;
import defpackage.AbstractC4613j91;
import defpackage.C2855b11;
import defpackage.C4162hF;
import defpackage.C5345me2;
import defpackage.C5365mj2;
import defpackage.C5426n2;
import defpackage.C5575nj2;
import defpackage.C5785oj2;
import defpackage.C6561sS;
import defpackage.C6577sX0;
import defpackage.C7652xe;
import defpackage.C8056za;
import defpackage.Cd2;
import defpackage.InterfaceC6774tT;
import defpackage.JX0;
import defpackage.KA0;
import defpackage.KX0;
import defpackage.LX0;
import defpackage.NX0;
import defpackage.Qb2;
import defpackage.R1;
import defpackage.Si2;
import defpackage.VT;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public Button A;
    public boolean B;
    public CharSequence C;
    public CharSequence D;
    public final LinkedHashSet<LX0<? super S>> d = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> e = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> g = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> h = new LinkedHashSet<>();
    public int i;
    public InterfaceC6774tT<S> j;
    public PickerFragment<S> k;
    public com.google.android.material.datepicker.a l;
    public VT m;
    public MaterialCalendar<S> n;
    public int o;
    public CharSequence p;
    public boolean q;
    public int r;
    public int s;
    public CharSequence t;
    public int u;
    public CharSequence v;
    public TextView w;
    public TextView x;
    public CheckableImageButton y;
    public NX0 z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            for (LX0<? super S> lx0 : materialDatePicker.d) {
                materialDatePicker.i().b1();
                lx0.a();
            }
            materialDatePicker.dismiss();
        }
    }

    public class b extends R1 {
        public b() {
        }

        @Override // defpackage.R1
        public final void d(@NonNull View view, @NonNull C5426n2 c5426n2) {
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setContentDescription(MaterialDatePicker.this.i().s1() + ", " + ((Object) c5426n2.g()));
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<View.OnClickListener> it = materialDatePicker.e.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            materialDatePicker.dismiss();
        }
    }

    public class d extends AbstractC4613j91<S> {
        public d() {
        }

        @Override // defpackage.AbstractC4613j91
        public final void a(S s) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            InterfaceC6774tT<S> interfaceC6774tTI = materialDatePicker.i();
            materialDatePicker.getContext();
            String strG = interfaceC6774tTI.G();
            TextView textView = materialDatePicker.x;
            InterfaceC6774tT<S> interfaceC6774tTI2 = materialDatePicker.i();
            materialDatePicker.requireContext();
            textView.setContentDescription(interfaceC6774tTI2.R0());
            materialDatePicker.x.setText(strG);
            materialDatePicker.A.setEnabled(materialDatePicker.i().Q0());
        }
    }

    public static int j(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarD = Qb2.d();
        calendarD.set(5, 1);
        Calendar calendarC = Qb2.c(calendarD);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean k(@NonNull Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C6577sX0.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public final InterfaceC6774tT<S> i() {
        if (this.j == null) {
            this.j = (InterfaceC6774tT) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.j;
    }

    public final void l() {
        requireContext();
        int iK0 = this.i;
        if (iK0 == 0) {
            iK0 = i().K0();
        }
        InterfaceC6774tT<S> interfaceC6774tTI = i();
        com.google.android.material.datepicker.a aVar = this.l;
        VT vt = this.m;
        MaterialTextInputPicker materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iK0);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC6774tTI);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", vt);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.h);
        materialCalendar.setArguments(bundle);
        this.n = materialCalendar;
        boolean z = this.y.h;
        if (z) {
            InterfaceC6774tT<S> interfaceC6774tTI2 = i();
            com.google.android.material.datepicker.a aVar2 = this.l;
            MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iK0);
            bundle2.putParcelable("DATE_SELECTOR_KEY", interfaceC6774tTI2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            materialTextInputPicker.setArguments(bundle2);
            materialCalendar = materialTextInputPicker;
        }
        this.k = materialCalendar;
        this.w.setText((z && getResources().getConfiguration().orientation == 2) ? this.D : this.C);
        InterfaceC6774tT<S> interfaceC6774tTI3 = i();
        getContext();
        String strG = interfaceC6774tTI3.G();
        TextView textView = this.x;
        InterfaceC6774tT<S> interfaceC6774tTI4 = i();
        requireContext();
        textView.setContentDescription(interfaceC6774tTI4.R0());
        this.x.setText(strG);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(childFragmentManager);
        aVar3.c(R.id.mtrl_calendar_frame, this.k, null, 2);
        aVar3.f();
        this.k.i(new d());
    }

    public final void m(@NonNull CheckableImageButton checkableImageButton) {
        this.y.setContentDescription(this.y.h ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.i = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.j = (InterfaceC6774tT) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.l = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.m = (VT) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.o = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.p = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.r = bundle.getInt("INPUT_MODE_KEY");
        this.s = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.t = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.u = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.v = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence text = this.p;
        if (text == null) {
            text = requireContext().getResources().getText(this.o);
        }
        this.C = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.D = text;
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int iK0 = this.i;
        if (iK0 == 0) {
            iK0 = i().K0();
        }
        Dialog dialog = new Dialog(contextRequireContext, iK0);
        Context context = dialog.getContext();
        this.q = k(context, android.R.attr.windowFullscreen);
        int i = C6577sX0.c(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName()).data;
        NX0 nx0 = new NX0(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.z = nx0;
        nx0.j(context);
        this.z.l(ColorStateList.valueOf(i));
        NX0 nx1 = this.z;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        nx1.k(Cd2.d.i(decorView));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.q ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.q) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(j(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(j(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.x = textView;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        textView.setAccessibilityLiveRegion(1);
        this.y = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.w = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.y.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.y;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, C7652xe.d(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C7652xe.d(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.y.setChecked(this.r != 0);
        Cd2.l(this.y, null);
        m(this.y);
        this.y.setOnClickListener(new KX0(this));
        this.A = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (i().Q0()) {
            this.A.setEnabled(true);
        } else {
            this.A.setEnabled(false);
        }
        this.A.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.t;
        if (charSequence != null) {
            this.A.setText(charSequence);
        } else {
            int i = this.s;
            if (i != 0) {
                this.A.setText(i);
            }
        }
        this.A.setOnClickListener(new a());
        Cd2.l(this.A, new b());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.v;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i2 = this.u;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new c());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.i);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.j);
        com.google.android.material.datepicker.a aVar = this.l;
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b();
        int i = com.google.android.material.datepicker.a.b.c;
        int i2 = com.google.android.material.datepicker.a.b.c;
        bVar.b = new com.google.android.material.datepicker.b(Long.MIN_VALUE);
        long j = aVar.d.j;
        long j2 = aVar.e.j;
        bVar.a = Long.valueOf(aVar.h.j);
        com.google.android.material.datepicker.a.c cVar = aVar.g;
        bVar.b = cVar;
        MaterialCalendar<S> materialCalendar = this.n;
        C2855b11 c2855b11 = materialCalendar == null ? null : materialCalendar.j;
        if (c2855b11 != null) {
            bVar.a = Long.valueOf(c2855b11.j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        C2855b11 c2855b11E = C2855b11.e(j);
        C2855b11 c2855b11E2 = C2855b11.e(j2);
        com.google.android.material.datepicker.a.c cVar2 = (com.google.android.material.datepicker.a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(c2855b11E, c2855b11E2, cVar2, l != null ? C2855b11.e(l.longValue()) : null, aVar.i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.m);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.o);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.s);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.t);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.u);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.v);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        C6561sS c5575nj2;
        C6561sS c5575nj3;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.q) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.z);
            if (!this.B) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer numValueOf = viewFindViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) viewFindViewById.getBackground()).getColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iG = C8056za.g(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iG);
                }
                Si2.a(window, false);
                window.getContext();
                int iD = i < 27 ? C4162hF.d(C8056za.g(window.getContext(), android.R.attr.navigationBarColor, -16777216), UserVerificationMethods.USER_VERIFY_PATTERN) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iD);
                boolean z3 = C8056za.l(0) || C8056za.l(numValueOf.intValue());
                window.getDecorView();
                if (i >= 30) {
                    c5575nj2 = new C5785oj2(window);
                } else {
                    c5575nj2 = i >= 26 ? new C5575nj2(window) : new C5365mj2(window);
                }
                c5575nj2.r(z3);
                boolean zL = C8056za.l(iG);
                if (C8056za.l(iD) || (iD == 0 && zL)) {
                    z = true;
                }
                window.getDecorView();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    c5575nj3 = new C5785oj2(window);
                } else {
                    c5575nj3 = i2 >= 26 ? new C5575nj2(window) : new C5365mj2(window);
                }
                c5575nj3.q(z);
                JX0 jx0 = new JX0(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingTop());
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                Cd2.d.u(viewFindViewById, jx0);
                this.B = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.z, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new KA0(requireDialog(), rect));
        }
        l();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.k.d.clear();
        super.onStop();
    }
}

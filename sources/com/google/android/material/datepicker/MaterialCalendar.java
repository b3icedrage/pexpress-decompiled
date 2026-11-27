package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import defpackage.AX0;
import defpackage.BX0;
import defpackage.C0945Ex;
import defpackage.C2855b11;
import defpackage.C4188hN1;
import defpackage.C5426n2;
import defpackage.C7838yX0;
import defpackage.C8048zX0;
import defpackage.CX0;
import defpackage.Cd2;
import defpackage.DX0;
import defpackage.InterfaceC6774tT;
import defpackage.Nl2;
import defpackage.R1;
import defpackage.RunnableC7628xX0;
import defpackage.VT;
import defpackage.ViewOnClickListenerC7418wX0;
import defpackage.WT;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public int e;
    public InterfaceC6774tT<S> g;
    public com.google.android.material.datepicker.a h;
    public VT i;
    public C2855b11 j;
    public d k;
    public C0945Ex l;
    public RecyclerView m;
    public RecyclerView n;
    public View o;
    public View p;
    public View q;
    public View r;

    public class a extends R1 {
        @Override // defpackage.R1
        public final void d(View view, @NonNull C5426n2 c5426n2) {
            View.AccessibilityDelegate accessibilityDelegate = this.a;
            AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    public class b extends C4188hN1 {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2) {
            super(i, false);
            this.E = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void B0(@NonNull RecyclerView.y yVar, @NonNull int[] iArr) {
            int i = this.E;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i == 0) {
                iArr[0] = materialCalendar.n.getWidth();
                iArr[1] = materialCalendar.n.getWidth();
            } else {
                iArr[0] = materialCalendar.n.getHeight();
                iArr[1] = materialCalendar.n.getHeight();
            }
        }
    }

    public class c {
        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d d;
        public static final d e;
        public static final /* synthetic */ d[] g;

        static {
            d dVar = new d("DAY", 0);
            d = dVar;
            d dVar2 = new d("YEAR", 1);
            e = dVar2;
            g = new d[]{dVar, dVar2};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) g.clone();
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void i(@NonNull MaterialDatePicker.d dVar) {
        this.d.add(dVar);
    }

    public final void j(C2855b11 c2855b11) {
        e eVar = (e) this.n.getAdapter();
        int i = eVar.d.d.i(c2855b11);
        int i2 = i - eVar.d.d.i(this.j);
        boolean z = Math.abs(i2) > 3;
        boolean z2 = i2 > 0;
        this.j = c2855b11;
        if (z && z2) {
            this.n.f0(i - 3);
            this.n.post(new RunnableC7628xX0(this, i));
        } else if (!z) {
            this.n.post(new RunnableC7628xX0(this, i));
        } else {
            this.n.f0(i + 3);
            this.n.post(new RunnableC7628xX0(this, i));
        }
    }

    public final void k(d dVar) {
        this.k = dVar;
        if (dVar == d.e) {
            this.m.getLayoutManager().o0(this.j.g - ((Nl2) this.m.getAdapter()).d.h.d.g);
            this.q.setVisibility(0);
            this.r.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            return;
        }
        if (dVar == d.d) {
            this.q.setVisibility(8);
            this.r.setVisibility(0);
            this.o.setVisibility(0);
            this.p.setVisibility(0);
            j(this.j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("THEME_RES_ID_KEY");
        this.g = (InterfaceC6774tT) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.h = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.i = (VT) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.j = (C2855b11) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.e);
        this.l = new C0945Ex(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C2855b11 c2855b11 = this.h.d;
        if (MaterialDatePicker.k(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.pexpress.tool.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.pexpress.tool.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.pexpress.tool.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.pexpress.tool.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = com.google.android.material.datepicker.c.k;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.pexpress.tool.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.pexpress.tool.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.pexpress.tool.R.id.mtrl_calendar_days_of_week);
        Cd2.l(gridView, new a());
        int i4 = this.h.i;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new WT(i4) : new WT()));
        gridView.setNumColumns(c2855b11.h);
        gridView.setEnabled(false);
        this.n = (RecyclerView) viewInflate.findViewById(com.pexpress.tool.R.id.mtrl_calendar_months);
        getContext();
        this.n.setLayoutManager(new b(i2, i2));
        this.n.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.g, this.h, this.i, new c());
        this.n.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.pexpress.tool.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.pexpress.tool.R.id.mtrl_calendar_year_selector_frame);
        this.m = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.m.setLayoutManager(new GridLayoutManager(integer));
            this.m.setAdapter(new Nl2(this));
            this.m.g(new C8048zX0(this));
        }
        if (viewInflate.findViewById(com.pexpress.tool.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.pexpress.tool.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            Cd2.l(materialButton, new AX0(this));
            View viewFindViewById = viewInflate.findViewById(com.pexpress.tool.R.id.month_navigation_previous);
            this.o = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.pexpress.tool.R.id.month_navigation_next);
            this.p = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.q = viewInflate.findViewById(com.pexpress.tool.R.id.mtrl_calendar_year_selector_frame);
            this.r = viewInflate.findViewById(com.pexpress.tool.R.id.mtrl_calendar_day_selector_frame);
            k(d.d);
            materialButton.setText(this.j.f());
            this.n.h(new BX0(this, eVar, materialButton));
            materialButton.setOnClickListener(new CX0(this));
            this.p.setOnClickListener(new DX0(this, eVar));
            this.o.setOnClickListener(new ViewOnClickListenerC7418wX0(this, eVar));
        }
        if (!MaterialDatePicker.k(contextThemeWrapper, R.attr.windowFullscreen)) {
            new B().a(this.n);
        }
        this.n.f0(eVar.d.d.i(this.j));
        Cd2.l(this.n, new C7838yX0());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.g);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.h);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.i);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.j);
    }
}

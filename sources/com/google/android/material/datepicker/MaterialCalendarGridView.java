package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import defpackage.C0945Ex;
import defpackage.C1037Gb1;
import defpackage.C2855b11;
import defpackage.Cd2;
import defpackage.EX0;
import defpackage.Fe2;
import defpackage.InterfaceC6774tT;
import defpackage.Qb2;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar d;
    public final boolean e;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = Qb2.e(null);
        if (MaterialDatePicker.k(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.pexpress.tool.R.id.cancel_button);
            setNextFocusRightId(com.pexpress.tool.R.id.confirm_button);
        }
        this.e = MaterialDatePicker.k(getContext(), com.pexpress.tool.R.attr.nestedScrollable);
        Cd2.l(this, new EX0());
    }

    @NonNull
    public final c a() {
        return (c) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public final Adapter getAdapter() {
        return (c) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((c) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iB;
        int width;
        int iB2;
        int width2;
        int i;
        int width3;
        int right;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        c cVar = (c) super.getAdapter();
        InterfaceC6774tT<?> interfaceC6774tT = cVar.e;
        C0945Ex c0945Ex = cVar.h;
        int iMax = Math.max(cVar.b(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(cVar.d(), materialCalendarGridView.getLastVisiblePosition());
        Long item = cVar.getItem(iMax);
        Long item2 = cVar.getItem(iMin);
        Iterator<C1037Gb1<Long, Long>> it = interfaceC6774tT.L().iterator();
        while (it.hasNext()) {
            C1037Gb1<Long, Long> next = it.next();
            Long l = next.a;
            if (l != null) {
                if (next.b != null) {
                    Long l2 = l;
                    long jLongValue = l2.longValue();
                    Long l3 = next.b;
                    long jLongValue2 = l3.longValue();
                    if (item == null || item2 == null || l2.longValue() > item2.longValue() || l3.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        cVar = cVar;
                        it = it;
                    } else {
                        boolean zC = Fe2.c(materialCalendarGridView);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.d;
                        C2855b11 c2855b11 = cVar.d;
                        if (jLongValue < jLongValue3) {
                            if (iMax % c2855b11.h == 0) {
                                right = 0;
                            } else {
                                right = !zC ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                            }
                            width = right;
                            iB = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iB = cVar.b() + (calendar.get(5) - 1);
                            View viewB = materialCalendarGridView.b(iB);
                            width = (viewB.getWidth() / 2) + viewB.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            if ((iMin + 1) % c2855b11.h == 0) {
                                width2 = materialCalendarGridView.getWidth();
                            } else {
                                width2 = !zC ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                            }
                            iB2 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iB2 = cVar.b() + (calendar.get(5) - 1);
                            View viewB2 = materialCalendarGridView.b(iB2);
                            width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                        }
                        int itemId = (int) cVar.getItemId(iB);
                        int itemId2 = (int) cVar.getItemId(iB2);
                        while (itemId <= itemId2) {
                            int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                            c cVar2 = cVar;
                            int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                            View viewB3 = materialCalendarGridView.b(numColumns);
                            int top = viewB3.getTop() + c0945Ex.a.a.top;
                            Iterator<C1037Gb1<Long, Long>> it2 = it;
                            int bottom = viewB3.getBottom() - c0945Ex.a.a.bottom;
                            if (zC) {
                                int i2 = iB2 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iB ? getWidth() : width;
                                i = i2;
                                width3 = width4;
                            } else {
                                i = numColumns > iB ? 0 : width;
                                width3 = iB2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, c0945Ex.h);
                            itemId++;
                            materialCalendarGridView = this;
                            cVar = cVar2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((c) super.getAdapter()).d());
        } else if (i == 130) {
            setSelection(((c) super.getAdapter()).b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((c) super.getAdapter()).b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((c) super.getAdapter()).b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.e) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((c) super.getAdapter()).b()) {
            super.setSelection(((c) super.getAdapter()).b());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public final ListAdapter getAdapter() {
        return (c) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof c)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), c.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}

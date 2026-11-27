package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class WT extends BaseAdapter {
    public static final int h;

    @NonNull
    public final Calendar d;
    public final int e;
    public final int g;

    static {
        h = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public WT() {
        Calendar calendarE = Qb2.e(null);
        this.d = calendarE;
        this.e = calendarE.getMaximum(7);
        this.g = calendarE.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.e;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.g;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.g;
        int i3 = this.e;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.d;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, h, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public WT(int i) {
        Calendar calendarE = Qb2.e(null);
        this.d = calendarE;
        this.e = calendarE.getMaximum(7);
        this.g = i;
    }
}

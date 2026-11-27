package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: a62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2652a62 implements U52 {
    public final /* synthetic */ W52.r d;

    public C2652a62(W52.r rVar) {
        this.d = rVar;
    }

    @Override // defpackage.U52
    public final <T> T52<T> a(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
            return this.d;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + this.d + "]";
    }
}

package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class RH0 extends ZH0 {
    public static final a s = new a();
    public static final JsonPrimitive t = new JsonPrimitive("closed");
    public final ArrayList p;
    public String q;
    public JsonElement r;

    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public RH0() {
        super(s);
        this.p = new ArrayList();
        this.r = JsonNull.d;
    }

    @Override // defpackage.ZH0
    public final void A(Number number) {
        if (number == null) {
            P(JsonNull.d);
            return;
        }
        if (!this.i) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        P(new JsonPrimitive(number));
    }

    @Override // defpackage.ZH0
    public final void B0() {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(L() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.ZH0
    public final void C(String str) {
        if (str == null) {
            P(JsonNull.d);
        } else {
            P(new JsonPrimitive(str));
        }
    }

    @Override // defpackage.ZH0
    public final void D(boolean z) {
        P(new JsonPrimitive(Boolean.valueOf(z)));
    }

    public final JsonElement L() {
        return (JsonElement) C1742Pc.c(1, this.p);
    }

    public final void P(JsonElement jsonElement) {
        if (this.q != null) {
            jsonElement.getClass();
            if (!(jsonElement instanceof JsonNull) || this.l) {
                JsonObject jsonObject = (JsonObject) L();
                jsonObject.d.put(this.q, jsonElement);
            }
            this.q = null;
            return;
        }
        if (this.p.isEmpty()) {
            this.r = jsonElement;
            return;
        }
        JsonElement jsonElementL = L();
        if (!(jsonElementL instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        JsonArray jsonArray = (JsonArray) jsonElementL;
        if (jsonElement == null) {
            jsonArray.getClass();
            jsonElement = JsonNull.d;
        }
        jsonArray.d.add(jsonElement);
    }

    @Override // defpackage.ZH0
    public final void X0() {
        JsonObject jsonObject = new JsonObject();
        P(jsonObject);
        this.p.add(jsonObject);
    }

    @Override // defpackage.ZH0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(t);
    }

    @Override // defpackage.ZH0
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.p.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(L() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.q = str;
    }

    @Override // defpackage.ZH0
    public final void h1() {
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty() || this.q != null) {
            throw new IllegalStateException();
        }
        if (!(L() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // defpackage.ZH0
    public final ZH0 l() {
        P(JsonNull.d);
        return this;
    }

    @Override // defpackage.ZH0
    public final void l1() {
        JsonArray jsonArray = new JsonArray();
        P(jsonArray);
        this.p.add(jsonArray);
    }

    @Override // defpackage.ZH0
    public final void t(double d) {
        if (this.i || !(Double.isNaN(d) || Double.isInfinite(d))) {
            P(new JsonPrimitive(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // defpackage.ZH0
    public final void u(long j) {
        P(new JsonPrimitive(Long.valueOf(j)));
    }

    @Override // defpackage.ZH0
    public final void v(Boolean bool) {
        if (bool == null) {
            P(JsonNull.d);
        } else {
            P(new JsonPrimitive(bool));
        }
    }

    @Override // defpackage.ZH0, java.io.Flushable
    public final void flush() {
    }
}

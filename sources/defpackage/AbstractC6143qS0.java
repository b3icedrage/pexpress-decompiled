package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: qS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class AbstractC6143qS0 {
    @NonNull
    public static C0762Co a(@NonNull BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C0762Co c0762Co = new C0762Co(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c0762Co;
                    }
                    C0762Co c0762Co2 = new C0762Co(jsonReader.nextLong());
                    jsonReader.close();
                    return c0762Co2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long b();
}

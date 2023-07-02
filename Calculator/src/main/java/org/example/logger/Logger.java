package org.example.logger;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class Logger implements System.Logger {

    private String className;

    public <T> Logger(Class<T> originalClass) {
        this.className = originalClass.getName();
    }

    /**
     * Returns the name of this logger.
     *
     * @return the logger name.
     */
    @Override
    public String getName() {
        return className;
    }

    /**
     * Checks if a message of the given level would be logged by
     * this logger.
     *
     * @param level the log message level.
     * @return {@code true} if the given log message level is currently
     * being logged.
     * @throws NullPointerException if {@code level} is {@code null}.
     */
    @Override
    public boolean isLoggable(Level level) {
        return true;
    }

    /**
     * Logs a localized message associated with a given throwable.
     * <p>
     * If the given resource bundle is non-{@code null},  the {@code msg}
     * string is localized using the given resource bundle.
     * Otherwise the {@code msg} string is not localized.
     *
     * @param level  the log message level.
     * @param bundle a resource bundle to localize {@code msg}; can be
     *               {@code null}.
     * @param msg    the string message (or a key in the message catalog,
     *               if {@code bundle} is not {@code null}); can be {@code null}.
     * @param thrown a {@code Throwable} associated with the log message;
     *               can be {@code null}.
     * @throws NullPointerException if {@code level} is {@code null}.
     */
    @Override
    public void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {
        System.out.println(msg);
    }

    /**
     * Logs a message with resource bundle and an optional list of
     * parameters.
     * <p>
     * If the given resource bundle is non-{@code null},  the {@code format}
     * string is localized using the given resource bundle.
     * Otherwise the {@code format} string is not localized.
     *
     * @param level  the log message level.
     * @param bundle a resource bundle to localize {@code format}; can be
     *               {@code null}.
     * @param format the string message format in {@link
     *               MessageFormat} format, (or a key in the message
     *               catalog if {@code bundle} is not {@code null}); can be {@code null}.
     * @param params an optional list of parameters to the message (may be
     *               none).
     * @throws NullPointerException if {@code level} is {@code null}.
     */
    @Override
    public void log(Level level, ResourceBundle bundle, String format, Object... params) {
        System.out.println(format);
    }
}

const purgecss = require('@fullhuman/postcss-purgecss')({
  content: [
    './public/**/*.html',
    './src/**/*.js',
  ],
  defaultExtractor: (content) => content.match(/[^<>"'`\s]*[^<>"'`\s:]/g) || [],
});

module.exports = {
  plugins: [
    require('tailwindcss'),
    require('autoprefixer'),
    ...(process.env.NODE_ENV === 'production' ? [purgecss] : []),
  ],
};